package reflection.chapter5;/**
 * Created by Administrator on 2021/11/18.
 */

import java.io.Serializable;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 18:59
 **/
public class CheckIfSuper {

    public static void checkIsInstance(){
        Object n = Integer.valueOf(123);
        boolean isDouble = n instanceof Double;
        boolean isInteger = n instanceof Integer;
        boolean isNumber = n instanceof Number;
        boolean isSeriable = n instanceof Serializable;
        System.out.println(String.format("isDouble=%b,isInteger=%b,isNumber=%b,isSeriable=%b", isDouble, isInteger, isNumber, isSeriable));
    }

    public static void checkIsAssginable(){
        boolean a = Integer.class.isAssignableFrom(Integer.class);
        boolean b = Number.class.isAssignableFrom(Integer.class);
        boolean c = Object.class.isAssignableFrom(Integer.class);
        boolean d = Integer.class.isAssignableFrom(Number.class);
        System.out.println(String.format("a=%b,b=%b,c=%b,d=%b", a, b, c, d));
    }

    public static void main(String[] args) {
        checkIsInstance();
        checkIsAssginable();
    }
}
