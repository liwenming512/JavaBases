package thread.chapter2;/**
 * Created by Administrator on 2022/1/27.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2022/1/27 23:21
 **/
public class Main3 {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("start new thread!");
        });
        t.start();
    }
}
