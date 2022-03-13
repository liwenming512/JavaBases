package com.lwm.dynamicproxy2;/**
 * Created by Administrator on 2020/6/28.
 */

import com.lwm.dynamicproxy2.UserService;
import com.lwm.dynamicproxy2.UserServiceImpl;
import com.lwm.dynamicproxy2.UserServiceProxy;

/**
 * @Author liwenming
 * @Description DynamicProxy2测试：静态代理
 * @Date 2020/6/28 20:21
 **/
public class DynamicProxy21Test {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.addUser();
    }
}
