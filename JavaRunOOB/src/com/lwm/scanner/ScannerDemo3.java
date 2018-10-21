package com.lwm.scanner;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		float f = 0.0f;
		if (scanner.hasNextInt()){
			i = scanner.nextInt();
			System.out.println("整数数据：" + i);
		}else{
			System.out.println("不是整数数据");
		}
		if (scanner.hasNextFloat()){
			f = scanner.nextFloat();
			System.out.println("浮点数：" + f);
		}else{
			System.out.println("不是浮点数");
		}
		scanner.close();
	}

}
