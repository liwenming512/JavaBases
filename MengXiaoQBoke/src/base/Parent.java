package base;

public class Parent {
	
	public static String p_static_field = "父类--静态变量";
	
	public String p_field = "父类--变量";
	
	protected int i = 9;
	
	protected int j = 0;
	
	static{
		System.out.println(p_static_field);
		System.out.println("父类--静态初始化块");
	}
	{
		System.out.println(p_field);
		System.out.println("父类--初始化块");
	}
	
	public Parent(){
		System.out.println("父类--构造器");
		System.out.println("i = " + i +", j = " + j);
		j = 20;
	}

}
