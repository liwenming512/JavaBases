package unit5;/**
 * Created by Administrator on 2020/7/4.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/4 23:39
 **/
public class OverloadingVarargs3 {

    static void f(float i, Character... args){
        System.out.println("first");
    }

    static void f(char c, Character... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
}
