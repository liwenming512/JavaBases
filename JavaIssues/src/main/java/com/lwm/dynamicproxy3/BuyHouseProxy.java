package com.lwm.dynamicproxy3;/**
 * Created by Administrator on 2020/6/29.
 */

/**
 * @Author liwenming
 * @Description
 * @Date 2020/6/29 9:56
 **/
public class BuyHouseProxy implements BuyHouse {

    private BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("购房前准备");
        buyHouse.buyHouse();
        System.out.println("购房后装修");
    }
}
