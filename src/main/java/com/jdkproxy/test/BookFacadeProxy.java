package com.jdkproxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/7/21.
 */
public class BookFacadeProxy implements InvocationHandler{
    private Object target;
    public BookFacadeProxy(Object target) {
        this.target=target;
    }
    //proxy为代理对象，method为方法。object为参数，result为返回的代理对象
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result=null;
        Object o=proxy;
        System.out.println("事务开始"+System.currentTimeMillis());
        result=method.invoke(target,args);
        System.out.println("事务结束"+System.currentTimeMillis());
        return result;
    }
}
