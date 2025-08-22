package com.example.demo.controller;

import com.example.demo.aspect.AroundDemoLog;
import com.example.demo.aspect.DemoLog;
import com.example.demo.common.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aspectLogPrint")
public class AspectLogController {


    @PostMapping(value = "/result")
    @DemoLog
    public String result(User user) {
        System.out.println("/aspectLogPrint/result 方法执行执行");
        return user.toString();
    }

    @PostMapping(value = "/resultException")
    @DemoLog
    public String resultException(User user) {
        System.out.println("/aspectLogPrint/resultException 方法执行执行");
        throw new RuntimeException("/resultException 异常");
    }

    @PostMapping(value = "/noResult")
    @DemoLog
    public void noResult(User user) {
        System.out.println("/aspectLogPrint/noResult 方法执行执行");
    }


    @PostMapping(value = "/around")
    @AroundDemoLog
    public String around(User user) {
        System.out.println("/aspectLogPrint/around 方法执行执行");
        throw new RuntimeException("/around 异常");
    }
}
