package singleton;/**
 * Created by Administrator on 2020/7/8.
 */

/**
 * @Author liwenming
 * @Description //饿汉式单例
 * @Date 2020/7/8 19:50
 **/
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}
