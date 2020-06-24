package com.yuntian.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ Author     ：guangleilei.
 * @ Date       ：Created in 16:08 2018/12/20
 * @ Description：${description}
 */
@EnableDubboConfiguration
@SpringBootApplication
@DubboComponentScan(basePackages = "${dubbo.scan.basePackages}")
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
