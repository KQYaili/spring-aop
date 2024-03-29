package com.lgd.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler{
    private Object obj;

    public JDKDynamicProxy(Object obj) {
        this.obj = obj;
    }

    public Object getProxy() {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        Object o = Proxy.newProxyInstance(classLoader, interfaces,this);
        return o;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------hello");
        begin();
        Object returnValue=method.invoke(obj,args);
        commit();
        return returnValue;
    }
    public void begin(){
        System.out.println("-----开启事务");
    }
    public void commit(){
        System.out.println("-------提交事务");
    }
}
