package thread.chapter4;/**
 * Created by Administrator on 2021/11/23.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/23 17:43
 **/
public class InterruptThread {

    static class MyThread extends Thread {
        @Override
        public void run() {
            int n = 0;
            while (!isInterrupted()) {
                n++;
                System.out.println(n + " hello!");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}
