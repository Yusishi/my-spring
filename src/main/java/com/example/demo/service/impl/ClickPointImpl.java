package com.example.demo.service.impl;

import com.example.demo.service.Point;
import org.springframework.stereotype.Service;

@Service(value = "ClickPointImpl")
public class ClickPointImpl implements Point {
    @Override
    public void getPoint() {
        System.out.println("点击获取积分");
    }
}
