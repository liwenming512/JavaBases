/**
 * Created by Administrator on 2020/7/12.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liwenming
 * @Description //内存监控例子
 * @Date 2020/7/12 11:16
 **/

public class MemoryMonitor {

    static class OOMObject{
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for(int i = 0; i < num; i++){
            Thread.sleep(500);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
