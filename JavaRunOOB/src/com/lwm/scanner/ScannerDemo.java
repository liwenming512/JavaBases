package com.lwm.scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("next��ʽ����");
		if (scanner.hasNext()){
			String str = scanner.next();
			System.out.println("��������Ϊ��" + str);
		}
		scanner.close();
	}

}
