package com.lgs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.lgs.dao")
public class RoleCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoleCenterApplication.class, args);
    }

}
