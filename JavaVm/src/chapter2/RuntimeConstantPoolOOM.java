package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/10/3.
 */
public class RuntimeConstantPoolOOM {

    private static void test1(){
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }

    private static void test2(){
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }

    public static void main(String[] args) {
        test1();
//        test2();
    }
}
