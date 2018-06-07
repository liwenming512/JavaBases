package com.lwm.variableType;

//局部变量说明：局部变量必须初始化后才能使用
public class Test {
	
	public void pupAge(){
		int age = 0;
		age = age + 7;
		System.out.println(age);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.pupAge();
	}

}
