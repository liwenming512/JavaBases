package com.lwm.dynamicproxy2;/**
 * Created by Administrator on 2020/6/28.
 */

import com.lwm.dynamicproxy2.JDKProxy;
import com.lwm.dynamicproxy2.UserService;
import com.lwm.dynamicproxy2.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author liwenming
 * @Description DynamicProxy2测试：动态代理
 * @Date 2020/6/28 20:33
 **/
public class DynamicProxy22Test {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        Class c = userService.getClass();
        ClassLoader classLoader = userService.getClass().getClassLoader();
        Class[] interfaces = c.getInterfaces();
        InvocationHandler h = new JDKProxy(userService);
        UserService proxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, h);
        proxy.addUser();
    }
}
