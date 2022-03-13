package com.lwm.dynamicproxy3;/**
 * Created by Administrator on 2020/6/29.
 */

import java.lang.reflect.Proxy;

/**
 * @Author liwenming
 * @Description
 * @Date 2020/6/29 10:05
 **/
public class DynamicProxyTest {

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(buyHouse.getClass().getClassLoader(),
                new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHouse();
    }
}
