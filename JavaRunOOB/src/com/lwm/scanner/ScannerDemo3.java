package com.lwm.scanner;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		float f = 0.0f;
		if (scanner.hasNextInt()){
			i = scanner.nextInt();
			System.out.println("�������ݣ�" + i);
		}else{
			System.out.println("������������");
		}
		if (scanner.hasNextFloat()){
			f = scanner.nextFloat();
			System.out.println("��������" + f);
		}else{
			System.out.println("���Ǹ�����");
		}
		scanner.close();
	}

}
