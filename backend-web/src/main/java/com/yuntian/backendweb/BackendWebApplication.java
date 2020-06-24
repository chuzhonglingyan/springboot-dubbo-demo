package com.yuntian.backendweb;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class BackendWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendWebApplication.class, args);
    }

}

