package com.yuntian.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuntian.provider.service.DemoService;

@Service(
        version = "${dubbo.registry.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}
