package com.yuntian.provider.service.impl;

import com.yuntian.provider.service.DemoService;

import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}
