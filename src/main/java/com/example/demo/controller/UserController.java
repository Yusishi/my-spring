package com.example.demo.controller;

import com.example.demo.aspect.DemoBeforeLog;
import com.example.demo.common.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping(value = "/findById")
    public void query() {
        System.out.println("进入query方法");
    }

    @PostMapping(value = "/add")
    @DemoBeforeLog
    public void insert(User user) {
        System.out.println(user.getName());
    }
}
