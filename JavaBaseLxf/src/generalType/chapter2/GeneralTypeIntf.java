package generalType.chapter2;/**
 * Created by Administrator on 2021/11/23.
 */

import java.util.Arrays;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2021/11/23 15:18
 **/
public class GeneralTypeIntf {

    static class Person implements Comparable<Person>{
        String name;
        int score;
        Person(String name, int score) {
            this.name = name;
            this.score = score;
        }
        @Override
        public String toString() {
            return this.name + "," + this.score;
        }

        @Override
        public int compareTo(Person o) {
            return this.score - o.score;
        }
    }


    public static void main(String[] args) {
        Person[] ps = new Person[]{
            new Person("Bob", 61),
            new Person("Alice", 88),
            new Person("Lily", 75)
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}
