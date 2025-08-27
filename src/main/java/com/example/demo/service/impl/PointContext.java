package com.example.demo.service.impl;

import com.example.demo.enums.PointsEnum;
import com.example.demo.service.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PointContext {

    @Autowired
    private Map<String, Point> pointMap = new HashMap<>();


    public Point getType(Integer type) {
        return pointMap.get(PointsEnum.getServiceName(type));
    }
}
