package test;

/**
 * Created by Administrator on 2019/6/19.
 */
public class NumberHolder {

    private int number;

    public synchronized void increase(){
        if (0 != number){
            try
            {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(number);
        notify();
    }

    public synchronized void decrease(){
        if (0 == number){
            try
            {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        number--;
        System.out.println(number);
        notify();
    }
}
