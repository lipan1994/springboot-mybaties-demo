
①先用idea创建springboot项目，引入mysql驱动与mybaties相关支持 引入web支持

数据库，主机（ngixn）安装docker镜像，启动mysql服务。

连接池使用druid（带监控功能)

注解版与xml配置版使用示例。

druid 的版本 指定为 1.20以下 或者配置 spring.datasource.druid.stat-view-servlet.enabled=true

注解版：
   开发mapper接口，客户化配置实现(增加一个类似MybatiesConfig的配置类）

xml版：
  mapper接口，接口对应的xml文件，全局的配置文件，在springboot配置中指定配置文件路径。