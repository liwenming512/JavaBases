package reflection.chapter6;/**
 * Created by Administrator on 2021/11/18.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/18 19:17
 **/
public class DynamicProxy {

    interface Hello{
        void morning(String name);
    }

    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")){
                    System.out.println("Good moring," + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(),
                new Class[]{Hello.class}, handler);
        hello.morning("Bob");
    }
}
