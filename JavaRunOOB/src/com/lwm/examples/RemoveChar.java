package com.lwm.examples;

public class RemoveChar {
	
	public static String RemovceCharAt(String str, Integer idx){
		return str.substring(0, idx) + str.substring(idx + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is java";
		System.out.println(RemovceCharAt(str, 3));
	}

}
