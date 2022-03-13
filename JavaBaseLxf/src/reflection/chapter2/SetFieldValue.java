package reflection.chapter2;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.Field;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 17:43
 **/
public class SetFieldValue {

    public static void main(String[] args) throws Exception {
        Person p = new Person("Xiao Ming");
        System.out.println(p.getName());
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p, "Xiao Hong");
        System.out.println(p.getName());
    }
}
