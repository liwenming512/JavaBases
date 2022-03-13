package test;/**
 * Created by Administrator on 2021/7/4.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/7/4 17:54
 **/
public class ListSplitter {

    private static List<Integer> genList(int count){
        List<Integer> retList = new ArrayList<>();
        for(int i = 0; i <= count; i++){
            retList.add(i);
        }
        return retList;
    }

    private static List<List<Integer>> splitList(List<Integer> list, int size){
        int count = list.size() / size + 1;
        int yu = list.size() % size;
        List<List<Integer>> retList = new ArrayList<>();
        for(int i = 0; i < count; i++){
            List<Integer> subList;
            if (i == count - 1) {
                subList = list.subList(size * i, size * i + yu);
            } else {
                subList = list.subList(i * size, size * (i + 1));
            }
            retList.add(subList);
        }
        return retList;
    }

    private static void printList(List<Integer> list){
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = genList(75);
        List<List<Integer>> intListList = splitList(intList, 20);
        for(int i = 0; i < intListList.size(); i++){
            List<Integer> tmpList = intListList.get(i);
            System.out.println("第" + i +"个数组如下：");
            printList(tmpList);
        }
    }
}
