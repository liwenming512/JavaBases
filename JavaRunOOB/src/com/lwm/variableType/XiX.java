package com.lwm.variableType;

public class XiX {
	
	public static String string = "静态变量";
	
	public String string2 = "实例变量";
	
	public static void method(){
		String string = "ss";
//		string2 = "ss";	
//		method2();
		System.out.println("静态方法");
	}
	
	public void method2(){
		method();
		System.out.println("非静态方法");
	}

	public static void main(String[] args) {
		XiX x = new XiX();
		x.method2();
		x.method();
	}

}
