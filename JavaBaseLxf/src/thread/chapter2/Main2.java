package thread.chapter2;/**
 * Created by Administrator on 2022/1/27.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2022/1/27 23:20
 **/
public class Main2 {

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("start new thread!");
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
