package reflection.chapter5;/**
 * Created by Administrator on 2021/11/18.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 18:42
 **/
public class GetParentClass {

    public static void main(String[] args) {
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
    }
}
