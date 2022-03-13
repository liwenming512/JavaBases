package com.lwm.dynamicproxy; /**
 * Created by Administrator on 2020/6/28.
 */

import java.lang.reflect.Proxy;

/**
 * @Author liwenming
 * @Description //动态代理测试类
 * @Date 2020/6/28 19:52
 **/
public class DynamicProxyTest {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        userDao.add();
        userDao.delete();
        userDao.update();
        userDao.find();
        System.out.println("-------");
        MyInvocationHandler handler = new MyInvocationHandler(userDao);
        UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), handler);
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.find();
    }
}
