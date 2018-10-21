package com.lwm.scanner;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringTokenizer strTokenizer = new StringTokenizer(scanner.nextLine());
		while(strTokenizer.hasMoreTokens()){
			System.out.println(strTokenizer.nextToken());
		}
	}

}
