package com.lu.j1993.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/8/4.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(public * com.lu.j1993.controller.*.*(..))")
    public void LogAspect(){}

    @Before("LogAspect()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("doBefore");
    }
    @Before("LogAspect()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("doAfter");
    }
    @AfterReturning("LogAspect()")
    public void doAfterReturning(JoinPoint joinPoint){
        System.out.println("doAfterReturning");
    }

    @AfterThrowing("LogAspect()")
    public void deAfterThrowing(JoinPoint joinPoint){
        System.out.println("deAfterThrowing");
    }

    @Around("LogAspect()")
    public Object deAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("deAround");
        return joinPoint.proceed();
    }
}
