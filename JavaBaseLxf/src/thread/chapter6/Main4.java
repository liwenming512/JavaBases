package thread.chapter6;/**
 * Created by Administrator on 2021/12/4.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/12/4 15:51
 **/
public class Main4 {

    public static void main(String[] args) throws Exception {
        Thread[] ts = new Thread[]{new AddStudentThread(), new DecStudentThread(), new AddTeacherThread(), new DecTeacherThread()};
        for (Thread t: ts){
            t.start();
        }
        for (Thread t: ts){
            t.join();
        }
        System.out.println(Counter.studentCount);
        System.out.println(Counter.teacherCount);
    }

    static class Counter {
        public static final Object lock = new Object();
        public static int studentCount = 0;
        public static int teacherCount = 0;
    }

    static class AddStudentThread extends Thread {
        @Override
        public void run() {
            for (int i=0; i<10000; i++) {
                synchronized(Counter.lock) {
                    Counter.studentCount += 1;
                }
            }
        }
    }

    static class DecStudentThread extends Thread {
        @Override
        public void run() {
            for (int i=0; i<10000; i++) {
                synchronized(Counter.lock) {
                    Counter.studentCount -= 1;
                }
            }
        }
    }

    static class AddTeacherThread extends Thread {
        @Override
        public void run() {
            for (int i=0; i<10000; i++) {
                synchronized(Counter.lock) {
                    Counter.teacherCount += 1;
                }
            }
        }
    }

    static class DecTeacherThread extends Thread {
        @Override
        public void run() {
            for (int i=0; i<10000; i++) {
                synchronized(Counter.lock) {
                    Counter.teacherCount -= 1;
                }
            }
        }
    }
}
