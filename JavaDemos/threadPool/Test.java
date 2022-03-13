/**
 * Created by Administrator on 2021/11/19.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/19 10:42
 **/
public class Test implements Runnable {

    static ExecutorService service = Executors.newFixedThreadPool(3);

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            service.execute(new Test());
        }
        service.shutdown();
    }
}
