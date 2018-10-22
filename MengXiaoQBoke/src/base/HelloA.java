package base;

public class HelloA {
	
	public HelloA(){
		System.out.println("A的构造函数");
	}

	{
		System.out.println("A的构造代码块");
	}
	
	static{
		System.out.println("A的静态代码块");
	}
	
	public static void main(String[] args) {
		HelloA A = new HelloA();
		HelloA B = new HelloA();
	}

}
