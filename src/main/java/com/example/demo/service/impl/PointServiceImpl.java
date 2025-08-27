package com.example.demo.service.impl;

import com.example.demo.service.Point;
import com.example.demo.service.PointService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class PointServiceImpl implements PointService {

    @Resource
    private PointContext pointContext;


    @Override
    public String getPoint(Integer type) {
        Point point = pointContext.getType(type);
        point.getPoint();
        return "成功执行";
    }
}
