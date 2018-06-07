package com.lwm.string;

public class StringTest3 {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
	}

}
