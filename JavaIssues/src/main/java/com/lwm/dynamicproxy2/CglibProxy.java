package com.lwm.dynamicproxy2;/**
 * Created by Administrator on 2020/6/28.
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description
 * @Date 2020/6/28 20:47
 **/
public class CglibProxy implements MethodInterceptor {

    public Object getProxy(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行被代理类之前要做的事情");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("执行被代理类之后要做的事情");
        return result;
    }
}
