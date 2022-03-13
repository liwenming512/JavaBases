package chapter2; /**
 * Created by Administrator on 2021/12/4.
 */

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * vm args: -Xmx20M -XX:MaxDirectMemorySize=10M
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/12/4 10:01
 **/
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        int i = 0;
        while (true){
            unsafe.allocateMemory(_1MB);
            System.out.println(i++);
        }
    }
}
