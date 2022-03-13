package com.lwm.dynamicproxy2;/**
 * Created by Administrator on 2020/6/28.
 */

/**
 * @Author liwenming
 * @Description //真实角色
 * @Date 2020/6/28 20:17
 **/
public class UserServiceImpl implements UserService {

    @Override
    public void addUser() {
        System.out.println("增加用户中。。。");
    }
}
