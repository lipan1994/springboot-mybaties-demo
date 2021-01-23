package com.llicat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.llicat.mapper")
public class SpringbootMybatiesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatiesDemoApplication.class, args);
    }

}
