package thread;/**
 * Created by Administrator on 2020/8/18.
 */

/**
 * @Author liwenming
 * @Description
 * @Date 2020/8/18 23:53
 **/
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Thread t = new Thread(main.runnable);
        System.out.println("This is main ");
        t.start();

        try {

            // 在 main线程睡个3秒钟
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("In main");
            e.printStackTrace();
        }

        // 设置中断
        t.interrupt();
    }

    Runnable runnable = () -> {
        int i = 0;
        try {
            while (i < 1000) {

                // 睡个半秒钟我们再执行
                Thread.sleep(500);

                System.out.println(i++);
            }
        } catch (InterruptedException e) {


            // 判断该阻塞线程是否还在
            System.out.println(Thread.currentThread().isAlive());

            // 判断该线程的中断标志位状态
            System.out.println(Thread.currentThread().isInterrupted());

            System.out.println("In Runnable");
            e.printStackTrace();
        }
    };
}
