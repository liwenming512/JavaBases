package thread.chapter4;/**
 * Created by Administrator on 2021/11/23.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/23 17:48
 **/
public class InterruptThread2 {

    static class MyThread extends Thread{
        @Override
        public void run(){
            Thread hello = new HelloThread();
            hello.start();
            try {
                hello.join();
            } catch (InterruptedException e) {
                System.out.println("interrupted!");
            }
            hello.interrupt();
        }
    }

    static class HelloThread extends Thread{
        @Override
        public void run() {
            int n = 0;
            while (!interrupted()){
                n++;
                System.out.println(n + " hello!");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}
