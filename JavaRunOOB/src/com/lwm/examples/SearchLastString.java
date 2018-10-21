package com.lwm.examples;

public class SearchLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOrig = "Hello World, Hello RunOOb";
		int idx = strOrig.lastIndexOf("Hello RunOOb");
		if (idx == -1){
			System.out.println("没有找到");
		}else{
			System.out.println("字符串最后出现的位置是：" + idx);
		}
	}

}
