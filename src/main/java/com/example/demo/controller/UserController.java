package com.example.demo.controller;

import com.example.demo.pojo.UserPojo;
import com.example.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/getUserById")
    public UserPojo getUserById(Integer id) {
        return userService.getUserById(id);
    }
}
