package reflection.chapter2;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.Field;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 17:32
 **/
public class GetFieldValue {

    public static void main(String[] args) throws Exception {
        Object p = new Person("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
    }
}
