package com.lwm.variableType;

//��̬������ʵ������
public class StaticTest {
	
	public static int staticint = 2;
	
	public int random = 2;
	
	public StaticTest(){
		staticint ++;
		random ++;
		System.out.println(staticint + "\t" + random);
	}

	public static void main(String[] args) {
		StaticTest test1 = new StaticTest();
		StaticTest test2 = new StaticTest();
	}

}
