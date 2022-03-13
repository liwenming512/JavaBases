package thread;/**
 * Created by Administrator on 2020/8/18.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/8/18 21:27
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        for(int x = 0; x < 200; x++){
            System.out.println(x);
        }
    }
}
