package com.lwm.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException {
		int[] arr = new int[10];
		int i = 0;
		Scanner scanner = new Scanner(new File("d://test.txt"));
		while(scanner.hasNextInt()){
			arr[i] = scanner.nextInt();
			i++;
		}
		scanner.close();
		for(int j = 0; j < i; j++){
			System.out.println(arr[j]);
		}
	}

}
