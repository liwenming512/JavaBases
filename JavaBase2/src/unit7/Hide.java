package unit7;/**
 * Created by Administrator on 2020/7/6.
 */

import net.mindview.util.Print;
import net.mindview.util.Print.*;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/6 9:21
 **/

class Homer{
    char doh(char c){
        Print.print("doh(char)");
        return 'd';
    }
    float doh(float f){
        Print.print("doh(float)");
        return 1.0f;
    }
}

class Milhouse{}

class Bart extends Homer{
    void doh(Milhouse m){
        Print.print("doh(Milhouse)");
    }
}

class Lisa extends Homer{

    void doh(Milhouse m){
        System.out.println("doh(Milhouse");
    }
}

public class Hide{
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
