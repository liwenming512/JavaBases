package thread.chapter8;/**
 * Created by Administrator on 2021/12/4.
 */

/**
 * 线程死锁演示
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/12/4 16:19
 **/
public class Counter2 {

    private int value = 0;
    private int another = 0;
    private Object lockA = new Object();
    private Object lockB = new Object();

    public void add(int m){
        synchronized (lockA){
            this.value += m;
            synchronized (lockB){
                this.another += m;
            }
        }
    }

    public void dec(int m){
        synchronized (lockB){
            this.another -= m;
            synchronized (lockA){
                this.value -= m;
            }
        }
    }

    public static void main(String[] args) {
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        new Thread(()->{
            c1.add(1);
            c1.dec(1);
        }).start();
        new Thread(()->{
            c2.add(1);
            c2.dec(1);
        }).start();
        System.out.println();
    }
}
