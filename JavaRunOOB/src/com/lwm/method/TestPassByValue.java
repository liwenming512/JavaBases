package com.lwm.method;

public class TestPassByValue {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		System.out.println(n1 + "\t" + n2);
		swap(n1, n2);
		System.out.println(n1 + "\t" + n2);
	}

	//由于是按值传递的，n1和n2为形参，故交换后实参并未发生交换
	public static void swap(int n1, int n2){
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
}
