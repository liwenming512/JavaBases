package unit5;/**
 * Created by Administrator on 2020/6/30.
 */

import net.mindview.util.Print;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/6/30 8:38
 **/
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValues(){
        Print.print("boolean " + t);
        Print.print("char [" + c + "]");
        Print.print("byte" + b);
        Print.print("short" + s);
        Print.print("int " + i);
        Print.print("long" + l);
        Print.print("float" + f);
        Print.print("double " + d);
        Print.print("reference " + reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
//        new InitialValues().printInitialValues();
    }
}
