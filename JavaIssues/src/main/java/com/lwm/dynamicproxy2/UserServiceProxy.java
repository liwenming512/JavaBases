package com.lwm.dynamicproxy2;/**
 * Created by Administrator on 2020/6/28.
 */

/**
 * @Author liwenming
 * @Description 代理角色
 * @Date 2020/6/28 20:18
 **/
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void addUser() {
        System.out.println("增加用户准备。。。");
        userService.addUser();
        System.out.println("增加用户结束。。。");
    }
}
