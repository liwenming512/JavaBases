package thread;/**
 * Created by Administrator on 2020/8/18.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/8/18 21:32
 **/
public class MyRunnableDemo {

    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);
        t1.start();
        t2.start();
    }
}
