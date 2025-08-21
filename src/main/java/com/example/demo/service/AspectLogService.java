package com.example.demo.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 利用AOP来实现日志打印
 */
@Component
@Aspect
public class AspectLogService {

    /**
     * 这里的注解需要写全路径
     * 方法执行前打印参数
     *
     * @param joinPoint 入参
     */
    @Before(value = "@annotation(com.example.demo.aspect.DemoBeforeLog)")
    public void before(JoinPoint joinPoint) {
        System.out.println("方法执行前");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }
}
