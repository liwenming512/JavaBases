package singleton;/**
 * Created by Administrator on 2020/7/8.
 */

/**
 * @Author liwenming
 * @Description //懒汉式单例
 * @Date 2020/7/8 19:46
 **/
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton(){
    }

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
