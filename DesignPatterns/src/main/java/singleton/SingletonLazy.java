package singleton;/**
 * Created by Administrator on 2020/7/8.
 */

import javax.sql.rowset.Predicate;

/**
 * @Author liwenming
 * @Description // 用懒汉式单例模式模拟产生美国当今总统对象。
 * @Date 2020/7/8 19:53
 **/
public class SingletonLazy {

    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();
        President zt2 = President.getInstance();
        zt2.getName();
        if(zt1 == zt2){
            System.out.println("他们是同一个人！");
        }else{
            System.out.println("他们不是同一人！");
        }
    }
}

class President{

    private static volatile President instance = null;

    private President(){
        System.out.println("产生一个总统！");
    }

    public static synchronized President getInstance(){
        if(instance == null){
            instance = new President();
        }else{
            System.out.println("已经有一个总统，不能产生新总统！");
        }
        return instance;
    }

    public void getName(){
        System.out.println("我是美国总统：特朗普。");
    }
}
