package unit7;/**
 * Created by Administrator on 2020/7/6.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/6 19:18
 **/

class Poppet{

    private int i;

    Poppet(int ii){
        i = ii;
    }
}

public class BlankFinal {

    private final int i = 0;

    private final int j;

    private final Poppet p;

    public BlankFinal(){
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x){
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
