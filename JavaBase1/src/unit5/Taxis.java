package unit5;

import java.util.Arrays;

public class Taxis {

	public static void main(String[] args) {
		int arr[] = new int[]{23, 42, 12, 8, 5, 10};
		System.out.println("ԭ���������ǣ�");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		Arrays.sort(arr);
		System.out.println("\n�����������ǣ�");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
