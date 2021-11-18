package unit5;

class Mug{
	Mug(int marker){
		System.out.println("Mug(" + marker + ")");
	}
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}

public class Mugs {
	Mug mug1;
	Mug mug2;
	Mug mug5 = new Mug(5);
	static Mug mug3;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}
	static Mug mug4 = new Mug(4);
	static
	{
		mug3 = new Mug(3);
	}
	Mugs(){
		System.out.println("Mugs()");
	}
	Mugs(int i){
		System.out.println("Mugs(int)");
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		new Mugs();
		System.out.println("new Mugs() completed");
		new Mugs(1);
		System.out.println("new Mugs(1) completed");
	}
}
