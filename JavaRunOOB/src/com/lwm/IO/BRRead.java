package com.lwm.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����ַ�������q�˳�");
		do{
			c = (char) bf.read();
			System.out.println(c);
		}while(c != 'q');
	}

}
