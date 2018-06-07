package com.lwm.string;

public class StringTest {

	public static void main(String[] args) {
		 // 常量池
		String str1 = "abc";
		// 堆内存中
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
