package com.lgd.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void method1(){
        System.out.println("---medthod1");
    }
    public void method2(){
        System.out.println("---medthod2");
    }
    public void method3(){
        System.out.println("---medthod3");
    }
    public void method4(){
        System.out.println("---medthod4");
    }
    public Object method5(ProceedingJoinPoint point) throws Throwable {
        System.out.println("---medthod5----before");
        Object v=point.proceed();
        System.out.println("----method5----after");
        return v;
    }
}
