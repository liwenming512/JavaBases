package thread.chapter7;/**
 * Created by Administrator on 2021/12/4.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/12/4 16:03
 **/
public class Counter {

    private int count = 0;

    public void add(int n){
        synchronized (this){
            count += n;
        }
    }

    public void dec(int n){
        synchronized (this){
            count -= n;
        }
    }

    public int get(){
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        new Thread(()->{
            c1.add(1);
        }).start();
        new Thread(()->{
            c1.dec(1);
        }).start();
        new Thread(()->{
            c2.add(1);
        }).start();
        new Thread(()->{
            c2.dec(1);
        }).start();
        System.out.println(c1.get());
        System.out.println(c2.get());
    }
}
