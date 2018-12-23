package com.yuntian.backendweb.component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yuntian.provider.service.HelloService;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ServiceConsumer {

    private static  final  String DEV_ADDRESS="${dubbo.reference.address}";
    private static  final  String version="${dubbo.consumer.version}";

    @Reference(version =version,url =DEV_ADDRESS)
    HelloService helloService;

    @Bean
    HelloService helloService(){
        return helloService;
    }


}
