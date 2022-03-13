package reflection.chapter3;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 18:21
 **/
public class InvokePubMethod {

    static class Person {
        String name;
        private void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p, "Bob");
        System.out.println(p.name);
    }
}
