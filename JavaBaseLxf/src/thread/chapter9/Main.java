package thread.chapter9;/**
 * Created by Administrator on 2021/12/4.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/12/4 16:27
 **/
public class Main {

    public static void main(String[] args) {
        TaskQueue q = new TaskQueue();
        List<Thread> ts = new ArrayList<Thread>();
        for(int i = 0; i < 5; i++){
            Thread t = new Thread(){
                @Override
                public void run(){
                    while (true){
                        try{
                            String s = q.getTask();
                            System.out.println("execute task:" + s);
                        }catch (InterruptedException e){
                            return;
                        }
                    }
                }
            };
            t.start();
            ts.add(t);
        }
        Thread add = new Thread(()->{
            for (int i = 0; i < 10; i++){
                String s = "t-" + Math.random();
                System.out.println("add Task:" + s);
                q.addTask(s);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        add.start();
        try {
            add.join();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Thread t: ts){
            t.interrupt();
        }
    }

    static class TaskQueue{

        Queue<String> queue = new LinkedList<>();

        public synchronized void addTask(String s){
            this.queue.add(s);
            this.notifyAll();
        }

        public synchronized String getTask() throws InterruptedException {
            while (queue.isEmpty()){
                this.wait();
            }
            return queue.remove();
        }
    }
}
