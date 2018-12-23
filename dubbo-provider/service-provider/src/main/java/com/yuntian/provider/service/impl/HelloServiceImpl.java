package com.yuntian.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuntian.provider.service.HelloService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ Author     ：guangleilei.
 * @ Date       ：Created in 16:05 2018/12/20
 * @ Description：${description}
 */
@Service(
        version = "${dubbo.registry.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloServiceImpl implements HelloService {

    private Logger logger=LoggerFactory.getLogger(getClass());

    @Override
    public void say(String msg) {
        logger.info(msg);
    }
}
