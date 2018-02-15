package unit5;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a Number:");
		int num = scanner.nextInt();
		scanner.close();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = i;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of arr is " + sum);
	}

}
