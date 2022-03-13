package reflection.chapter4;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.Constructor;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 18:36
 **/
public class GetConstructMethod {

    public static void main(String[] args) throws Exception {
        Constructor cons1 = Integer.class.getConstructor(int.class);
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);
    }
}
