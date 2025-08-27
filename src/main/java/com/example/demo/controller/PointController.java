package com.example.demo.controller;

import com.example.demo.service.PointService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/point")
public class PointController {


    @Resource
    private PointService pointService;

    @PostMapping("/getPoint")
    public String getPoint(@RequestParam("type") Integer type) {
        return pointService.getPoint(type);
    }
}
