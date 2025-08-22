package com.example.demo.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AspectAroundService {

    @Around(value = "@annotation(com.example.demo.aspect.AroundDemoLog)")
    public void around(ProceedingJoinPoint point) throws Throwable {
        try {
            System.out.println("-------------");
            System.out.println("around @before入参打印");
            System.out.println(Arrays.toString(point.getArgs()));
            Object proceed = point.proceed();
            System.out.println(proceed == null ? "无返回参数" : "around @afterReturning 参数打印");
            System.out.println(proceed == null ? "" : proceed.toString());
        } catch (Throwable throwable) {
            System.out.println("around 异常打印");
            System.out.println(throwable.getMessage());
        } finally {
            System.out.println("around @after后逻辑");
        }
    }
}
