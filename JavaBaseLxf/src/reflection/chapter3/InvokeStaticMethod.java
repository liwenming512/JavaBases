package reflection.chapter3;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 18:15
 **/
public class InvokeStaticMethod {

    public static void main(String[] args) throws Exception {
        Method m = Integer.class.getMethod("parseInt", String.class);
        Integer n = (Integer) m.invoke(null, "12345");
        System.out.println(n);
    }
}
