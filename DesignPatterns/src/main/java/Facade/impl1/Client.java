package main.java.Facade.impl1;/**
 * Created by Administrator on 2021/6/19.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/6/19 19:25
 **/
public class Client {

    interface ProjectGroup{

        void require();

        void dev();

        void test();
    }

    class FeiTian implements ProjectGroup{

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

    public static void main(String[] args) {
        PM pm = new PM();
        pm.start("开始飞天项目");
    }
}
