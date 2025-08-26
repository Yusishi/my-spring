package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.vo.UserVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/getUserById")
    public UserVO getUserById(Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/insert")
    public Long insert(@RequestBody UserVO userVO) {
        return userService.insert(userVO);
    }

}
