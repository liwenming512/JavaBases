package thread;/**
 * Created by Administrator on 2020/8/18.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/8/18 21:31
 **/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(x);
        }
    }
}
