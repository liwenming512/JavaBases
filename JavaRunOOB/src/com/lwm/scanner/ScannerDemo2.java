package com.lwm.scanner;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nextline方式接收");
		if (scanner.hasNextLine()){
			String str = scanner.nextLine();
			System.out.println("输入的数据为：" + str);
		}
		scanner.close();
	}

}
