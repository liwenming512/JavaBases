/**
 * Created by Administrator on 2020/7/13.
 */

/**
 * @Author liwenming
 * @Description //死锁代码样例
 * @Date 2020/7/13 19:47
 **/
public class DeadLockTest {

    static class SyncAddRunable implements Runnable{

        int a, b;

        public SyncAddRunable(int a, int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)){
                synchronized (Integer.valueOf(b)){
                    System.out.println(a + b);
                }
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            new Thread(new SyncAddRunable(1, 2)).start();
            new Thread(new SyncAddRunable(2, 1)).start();
        }
    }
}
