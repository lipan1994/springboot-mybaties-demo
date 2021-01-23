package com.llicat.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.ResourceServlet;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.*;

/**
 * @author: lipan
 * @date: 2021/1/20 21:57
 * @descr :配置druid 可视化监控界面 && 数据源配置 覆盖spring自动注入的DataSource
 */

@Configuration
public class DruidConfig {


    /*用户名*/
    public static  final String USERNAME="admin";

    /*密码*/
    public static  final String PASSWORD="admin";


//    public static  final String  DENYIPS="192.168.0.1,192.168.0.2";

    public static final List<String> DENYIPS=new ArrayList<>();

    static {
        DENYIPS.add("192.168.0.1");
        DENYIPS.add("192.168.0.2");
    }


    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();
    }


    //配置webServlet
    @Bean
    public ServletRegistrationBean druidMonitorServlet(){

        ServletRegistrationBean druidMonitorServlet=new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String,Object> initParameters=new HashMap<>();
        initParameters.put(ResourceServlet.PARAM_NAME_USERNAME,USERNAME);
        initParameters.put(ResourceServlet.PARAM_NAME_PASSWORD,PASSWORD);
        initParameters.put(ResourceServlet.PARAM_NAME_DENY,String.join(","));
        druidMonitorServlet.setInitParameters(initParameters);
        return druidMonitorServlet;
    }

    //配置webFilter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.css,/druid/**");

        bean.setInitParameters(initParams);

        bean.setUrlPatterns(Arrays.asList("/*"));

        return  bean;
    }

}
