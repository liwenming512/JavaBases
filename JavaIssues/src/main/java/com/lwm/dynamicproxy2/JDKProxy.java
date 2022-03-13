package com.lwm.dynamicproxy2;/**
 * Created by Administrator on 2020/6/28.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description //动态代理类
 * @Date 2020/6/28 20:28
 **/
public class JDKProxy implements InvocationHandler {

    private Object target;

    private AddLogs logger = new AddLogs();

    public JDKProxy(Object target){
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public AddLogs getLogger() {
        return logger;
    }

    public void setLogger(AddLogs logger) {
        this.logger = logger;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        System.out.println(methodName + "is invocation");
        logger.addLog();
        Object o = method.invoke(target, args);
        return o;
    }
}
