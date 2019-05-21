package unit11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Administrator on 2019/5/17.
 */
public class SimpleColletion {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            c.add(i);
        }
        for(Integer i: c){
            System.out.print(i + ", ");
        }
    }
}
