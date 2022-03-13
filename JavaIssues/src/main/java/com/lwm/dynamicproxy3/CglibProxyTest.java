package com.lwm.dynamicproxy3;/**
 * Created by Administrator on 2020/6/29.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/6/29 10:31
 **/
public class CglibProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
        buyHouseCglibProxy.buyHouse();
    }
}
