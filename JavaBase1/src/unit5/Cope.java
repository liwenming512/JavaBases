package unit5;

import java.util.Arrays;

public class Cope {

	public static void main(String[] args) {
		int arr[] = new int[]{23, 42, 12};
		System.out.println("原数组：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		int arr2[] = Arrays.copyOf(arr, 5);
		System.out.println("\n新数组：");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
	}

}
