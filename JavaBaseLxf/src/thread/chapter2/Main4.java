package thread.chapter2;/**
 * Created by Administrator on 2022/1/27.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2022/1/27 23:24
 **/
public class Main4 {

    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("thread run...");
                System.out.println("thread end.");
            }
        };
        t.start();
        System.out.println("main end...");
    }
}
