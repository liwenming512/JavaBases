package com.lwm.dynamicproxy; /**
 * Created by Administrator on 2020/6/28.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/6/28 19:44
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        Object result = method.invoke(target, args);
        System.out.println("日志记录");
        return result;
    }
}
