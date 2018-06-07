package com.lwm.variableType;

//静态变量和实例变量
public class StaticTest2 {
	
	public static int staticint = 2;
	
	public int random = 2;
	
	public StaticTest2(){
		staticint ++;
		random ++;
	}

	public static void main(String[] args) {
		StaticTest2 test1 = new StaticTest2();
		System.out.println(test1.staticint + "\t" + test1.random);
		StaticTest2 test2 = new StaticTest2();
		System.out.println(test2.staticint + "\t" + test2.random);
		
		System.out.println(A.staticA);
		A a = new A();
		System.out.println(a.staticA);
		a.toChange();
		System.out.println(a.staticA);
		a.toChang2();
		System.out.println(a.staticA);
		
		System.out.println(B.staticB);
	}
}

class A {
	public static String staticA = "A";
	
	static { staticA = "A1"; }
	
	public A(){
		staticA = "A2";
	}
	
	public static void toChange(){
		staticA = "A3";
	}
	
	public static void toChang2(){
		staticA = "A4";
	}
}

class B{
	
	public static final String staticB;
	
	static { staticB = "B"; };
}
