package com.lgd.dao;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibDynamicProxy implements MethodInterceptor {
    private Object obj;

    public CGLibDynamicProxy(Object obj) {
        this.obj = obj;
    }
    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("---------hello");
        begin();
        Object returnValue=method.invoke(obj,objects);
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
