package com.yuntian.backendweb.controller;

import com.yuntian.backendweb.base.Result;
import com.yuntian.backendweb.base.ResultUtil;
import com.yuntian.provider.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

/**
 * @ Author     ：guangleilei.
 * @ Date       ：Created in 16:16 2018/12/20
 * @ Description：${hello}
 */
@Controller
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/say")
    @ResponseBody
    public Result say(@RequestParam String msg) {
        helloService.say(msg);
        return ResultUtil.createSuccess();
    }


}
