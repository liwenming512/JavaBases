package thread;/**
 * Created by Administrator on 2020/8/18.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/8/18 21:28
 **/
public class MyThreadDemo {

    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.start();
        my2.start();
    }
}
