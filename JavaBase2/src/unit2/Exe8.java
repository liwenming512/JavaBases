package unit2;

class StaticTest2{
	static int i = 47;
}

public class Exe8 {

	public static void main(String[] args) {
		StaticTest2 st1 = new StaticTest2();
		StaticTest2 st2 = new StaticTest2();
		StaticTest2.i ++;
		System.out.println(st1.i);
		System.out.println(st2.i);
	}

}
