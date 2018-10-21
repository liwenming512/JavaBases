package com.lwm.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		do{
			str = bf.readLine();
			System.out.println(str);
		}while(!str.equals("end"));
	}
}
