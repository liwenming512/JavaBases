package thread.chapter2;/**
 * Created by Administrator on 2022/1/27.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2022/1/27 23:27
 **/
public class Main5 {

    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("thread run...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("thread end.");
            }
        };
        t.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end...");
    }
}
