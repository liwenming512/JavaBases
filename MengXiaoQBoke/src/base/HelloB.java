package base;

public class HelloB extends HelloA {
	
	public HelloB(){
		System.out.println("B的构造函数");
	}

	{
		System.out.println("B的构造代码块");
	}
	
	static{
		System.out.println("B的静态代码块");
	}

	public static void main(String[] args) {
		HelloB B = new HelloB();
	}

}
