package com.example.demo.service.impl;

import com.example.demo.service.Point;
import org.springframework.stereotype.Service;

@Service(value = "LoginPointImpl")
public class LoginPointImpl implements Point {
    @Override
    public void getPoint() {
        System.out.println("登录获取积分");
    }
}
