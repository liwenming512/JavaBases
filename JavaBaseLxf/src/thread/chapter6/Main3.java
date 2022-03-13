package thread.chapter6;/**
 * Created by Administrator on 2021/12/4.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/12/4 12:25
 **/
public class Main3 {

    public static void main(String[] args) throws Exception {
        AddThread add = new AddThread();
        DecThread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }

    static class Counter{
        public static final Object lock1 = new Object();
        public static final Object lock2 = new Object();
        public static int count = 0;
    }

    static class AddThread extends Thread{
        @Override
        public void run(){
            for (int i = 0; i < 10000; i++){
                synchronized (Counter.lock1){
                    Counter.count += 1;
//                    System.out.println(Counter.count);
                }
            }
        }
    }

    static class DecThread extends Thread{
        @Override
        public void run(){
            for(int i = 0; i < 10000; i++){
                synchronized (Counter.lock2){
                    Counter.count -= 1;
//                    System.out.println(Counter.count);
                }
            }
        }
    }
}
