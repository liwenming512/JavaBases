package com.lwm.scanner;

import java.util.Scanner;

public class ScannerDemo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		int i = 0;
		while(scanner.hasNextDouble()){
			i = i + 1;
			double d = scanner.nextDouble();
			sum = sum + d;
		}
		System.out.println("个数：" + i);
		System.out.println("平均值：" + sum/i);
		scanner.close();
	}

}
