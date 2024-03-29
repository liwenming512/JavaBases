package reflection.chapter3;/**
 * Created by Administrator on 2021/11/18.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 17:57
 **/
public class GetMethods {

    class Student extends Person {
        public int getScore(String type) {
            return 99;
        }
        private int getGrade(int year) {
            return 1;
        }
    }

    class Person {
        public String getName() {
            return "Person";
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class stdClass = Student.class;
        // 获取public方法getScore，参数为String:
        System.out.println(stdClass.getMethod("getScore", String.class));
        // 获取继承的public方法getName，无参数:
        System.out.println(stdClass.getMethod("getName"));
        // 获取private方法getGrade，参数为int:
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
    }
}
