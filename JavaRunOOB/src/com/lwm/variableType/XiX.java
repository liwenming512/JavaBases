package com.lwm.variableType;

public class XiX {
	
	public static String string = "��̬����";
	
	public String string2 = "ʵ������";
	
	public static void method(){
		String string = "ss";
//		string2 = "ss";	
//		method2();
		System.out.println("��̬����");
	}
	
	public void method2(){
		method();
		System.out.println("�Ǿ�̬����");
	}

	public static void main(String[] args) {
		XiX x = new XiX();
		x.method2();
		x.method();
	}

}
