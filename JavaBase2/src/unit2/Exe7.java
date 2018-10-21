package unit2;

class StaticTest{
	static int i = 47;
}

class Incrementable{
	static void increment(){
		StaticTest.i ++;
	}
}

public class Exe7 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Incrementable sf = new Incrementable();
		sf.increment();
		System.out.print(StaticTest.i);
	}

}
