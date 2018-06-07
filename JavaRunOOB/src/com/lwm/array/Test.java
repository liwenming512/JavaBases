package com.lwm.array;

public class Test {

	public static void main(String[] args) {
		String str = "helloworld";
		char[] data = str.toCharArray();
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + " ");
			data[i] -= 32;
			System.out.print(data[i] + " ");
		}
		System.out.println(new String(data));
	}

}
