package com.lwm.dynamicproxy3;/**
 * Created by Administrator on 2020/6/29.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/6/29 9:59
 **/
public class ProxyTest {

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
