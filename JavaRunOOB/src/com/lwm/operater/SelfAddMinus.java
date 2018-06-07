package com.lwm.operater;

public class SelfAddMinus {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int x = 2 * ++a;
		int y = 2 * b++;
		System.out.println("a=" + a + "\t" + "x=" + x);
		System.out.println("b=" + b + "\t" + "y=" + y);
	}

}
