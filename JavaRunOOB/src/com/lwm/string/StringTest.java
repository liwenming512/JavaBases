package com.lwm.string;

public class StringTest {

	public static void main(String[] args) {
		 // ������
		String str1 = "abc";
		// ���ڴ���
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
