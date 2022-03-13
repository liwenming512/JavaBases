package com.lwm.dynamicproxy3;/**
 * Created by Administrator on 2020/6/29.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/6/29 10:01
 **/
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");
        Object result = method.invoke(object, args);
        System.out.println("买房后装修");
        return result;
    }
}
