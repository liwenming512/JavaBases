package unit7;/**
 * Created by Administrator on 2020/7/6.
 */

import net.mindview.util.Print;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/7/6 10:16
 **/

class Villian{

    private String name;

    protected void set(String nm){
        name = nm;
    }

    public Villian(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "I'm a Villain and my name is " + name;
    }
}

public class Orc extends Villian{

    private int orcNumber;

    public Orc(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString(){
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        Print.print(orc);
        orc.change("Bob", 19);
        Print.print(orc);
    }
}
