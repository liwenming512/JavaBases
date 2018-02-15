package unit5;

import java.util.Arrays;

public class Taxis {

	public static void main(String[] args) {
		int arr[] = new int[]{23, 42, 12, 8, 5, 10};
		System.out.println("原来的数组是：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		Arrays.sort(arr);
		System.out.println("\n排序后的数组是：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
