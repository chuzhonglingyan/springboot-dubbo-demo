package com.yuntian.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuntian.provider.service.DemoService;
import com.yuntian.provider.service.HelloService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}
