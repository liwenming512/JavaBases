package test;/**
 * Created by Administrator on 2020/10/9.
 */

import oracle.jrockit.jfr.StringConstantPool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2020/10/9 19:31
 **/
public class ExistJugdge {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        List<String> list2 = new ArrayList<>();
        list2.add("赵六");
        list2.add("溜达");
        list2.add("胡儿");

        for(String str:list2){
            boolean b = true;
            for(int i = 0; i < list.size(); i++){
                if(str.equals(list.get(i).toString())){
                    break;
                }
                if (i == list.size() - 1){
                    b = false;
                }
            }
            if (b == false){
                System.out.println(str + ":不存在");
            }else{
                System.out.println(str + ":存在");
            }
        }
    }
}
