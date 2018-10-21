package com.lwm.examples;

public class StringCompareEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		String anotherStr = "hello world";
		Object objStr = str;
		System.out.println(str.compareTo(anotherStr));
		System.out.println(str.compareToIgnoreCase(anotherStr));
		System.out.println(str.compareTo(objStr.toString()));
	}

}
