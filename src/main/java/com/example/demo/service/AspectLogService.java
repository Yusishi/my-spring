package com.example.demo.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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
    @Before(value = "@annotation(com.example.demo.aspect.DemoLog)")
    public void before(JoinPoint joinPoint) {
        System.out.println("-----------------");
        System.out.println("@before 打印入参");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 一个注解可以执行多个逻辑 如果想要一个方法执行多个AOP逻辑可以使用一个注解来执行
     * 只要方法执行 不管有没有异常都会执行after逻辑
     * after执行晚于afterReturning
     */
    @After(value = "@annotation(com.example.demo.aspect.DemoLog)")
    public void after() {
        System.out.println("@after 方法执行后逻辑");

    }

    /**
     * 只有方法正常执行并且有返回值时候才能触发 如果抛出异常或者没有返回值不会触发
     */
    @AfterReturning(value = "@annotation(com.example.demo.aspect.DemoLog)", returning = "result")
    public void afterReturning(String result) {
        System.out.println("@afterReturning 结果打印");
        System.out.println(result);

    }

    @AfterThrowing(value = "@annotation(com.example.demo.aspect.DemoLog)", throwing = "exception")
    public void afterThrowing(Throwable exception) {
        System.out.println("@afterThrowing 异常打印");
        System.out.println(exception.getMessage());

    }

}
