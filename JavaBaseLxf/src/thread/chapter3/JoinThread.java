package thread.chapter3;/**
 * Created by Administrator on 2021/11/23.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/23 17:17
 **/
public class JoinThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
//            try {
//                Thread.sleep(15);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        t.join();
        System.out.println("end");
    }
}
