package reflection.chapter2;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 17:09
 **/
public class AccessFields {

    class Student extends Person {
        public int score;
        private int grade;
    }

    class Person {
        public String name;
    }

    public static void getStringClassInfo() throws NoSuchFieldException {
        Field f = String.class.getDeclaredField("value");
        System.out.println(f.getName());
        System.out.println(f.getType());
        int m = f.getModifiers();
        System.out.println(Modifier.isFinal(m));
        System.out.println(Modifier.isPublic(m));
        System.out.println(Modifier.isProtected(m));
        System.out.println(Modifier.isPrivate(m));
        System.out.println(Modifier.isStatic(m));
    }

    public static void main(String[] args) throws NoSuchFieldException {
//        Class stdClass = Student.class;
//        System.out.println(stdClass.getField("score"));
//        System.out.println(stdClass.getField("name"));
//        System.out.println(stdClass.getDeclaredField("grade"));
        getStringClassInfo();
    }
}
