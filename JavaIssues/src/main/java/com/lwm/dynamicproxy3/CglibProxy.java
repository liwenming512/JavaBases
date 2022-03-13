package com.lwm.dynamicproxy3;/**
 * Created by Administrator on 2020/6/29.
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/6/29 10:28
 **/
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(final Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前准备");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("买房后装修");
        return result;
    }
}
