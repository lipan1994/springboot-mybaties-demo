package com.llicat.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lipan
 * @date: 2021/1/21 22:11
 * @desc: mybaties配置 相当于 configuration.xml
 */

@Configuration
public class MybatiesConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        System.out.println("aaaaaccccccc");
        return (config)->config.setMapUnderscoreToCamelCase(true);
    }
}
