package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/10/3.
 */
public class HeapOOM {

    static class OOMObject{
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
