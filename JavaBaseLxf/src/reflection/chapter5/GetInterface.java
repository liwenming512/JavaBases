package reflection.chapter5;/**
 * Created by Administrator on 2021/11/18.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 18:46
 **/
public class GetInterface {

    public static void getSelfIntf(){
        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for (Class i: is){
            System.out.println(i);
        }
    }

    public static void getParentIntf(){
        Class s = Integer.class.getSuperclass();
        Class[] is = s.getInterfaces();
        for (Class i: is){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        getSelfIntf();
        getParentIntf();
    }
}
