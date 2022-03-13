package thread.chapter8;/**
 * Created by Administrator on 2021/12/4.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/12/4 16:11
 **/
public class Counter {

    private int count = 0;

    public synchronized void add(int n){
        if(n < 0){
            dec(-n);
        }else{
            count += n;
        }
    }

    public synchronized void dec(int n){
        count += n;
    }
}
