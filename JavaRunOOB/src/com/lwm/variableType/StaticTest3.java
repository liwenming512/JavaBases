package com.lwm.variableType;

public class StaticTest3 {
	
	private static int staticint = 2;
	
	private int random = 2;

	public static void main(String[] args) {
		System.out.println(staticint);
		StaticTest3 test = new StaticTest3();
		System.out.println(test.random);
	}

}
