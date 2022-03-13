package reflection.chapter3;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 18:11
 **/
public class InvokeMethod {

    public static void main(String[] args) throws Exception {
        String s = "Hello world";
        Method m = String.class.getMethod("substring", int.class);
        String str = (String) m.invoke(s, 6);
        System.out.println(str);
    }
}
