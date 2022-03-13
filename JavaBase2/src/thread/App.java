package thread;/**
 * Created by Administrator on 2020/8/19.
 */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author liwenming
 * @Description https://www.cnblogs.com/rinack/p/9888717.html
 * @Date 2020/8/19 20:46
 **/
public class App {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(1,1,60L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        System.out.println("abcdefg");
                                    }
                                });
        executorService.shutdown();
    }
}
