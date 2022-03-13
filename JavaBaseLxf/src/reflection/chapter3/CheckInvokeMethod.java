package reflection.chapter3;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.Method;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 18:28
 **/
public class CheckInvokeMethod {

    static class Person {
        public void hello() {
            System.out.println("Person:hello");
        }
    }

    static class Student extends Person {

        @Override
        public void hello() {
            System.out.println("Student:hello");
        }
    }

    public static void main(String[] args) throws Exception {
        Method m = Person.class.getMethod("hello");
        m.invoke(new Student());
    }
}
