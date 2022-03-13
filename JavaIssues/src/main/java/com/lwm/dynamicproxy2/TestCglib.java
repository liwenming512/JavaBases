package com.lwm.dynamicproxy2;/**
 * Created by Administrator on 2020/6/28.
 */

/**
 * @Author liwenming
 * @Description Cglib测试类
 * @Date 2020/6/28 22:54
 **/
public class TestCglib {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        RunMethod proxyImpl = (RunMethod) proxy.getProxy(RunMethod.class);
        proxyImpl.Run();
    }
}
