package base;

public class InitialOrderTest {
	
	static String staticfield = "静态变量";
	
	private String field = "变量";
	
	static{
		System.out.println(staticfield);
		System.out.println("静态初始化块");
	}
	
	{
		System.out.println(field);
		System.out.println("初始化块");
	}
	
	public InitialOrderTest(){
		System.out.println("构造器");
	}

	public static void main(String[] args) {
		new InitialOrderTest();
	}

}
