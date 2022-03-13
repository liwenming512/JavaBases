package thread.chapter2;/**
 * Created by Administrator on 2022/1/27.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2022/1/27 23:16
 **/
public class Main1 {

    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("start new thread!");
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
