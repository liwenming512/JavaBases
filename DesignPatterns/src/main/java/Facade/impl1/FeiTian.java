package main.java.Facade.impl1;/**
 * Created by Administrator on 2021/6/19.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/6/19 19:32
 **/
public class FeiTian implements ProjectGroup{

    @Override
    public void require() {
        System.out.println("需求分析");
    }

    @Override
    public void dev() {
        System.out.println("开发");
    }

    @Override
    public void test() {
        System.out.println("测试");
    }
}
