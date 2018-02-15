package unit5;

public class MinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{8, 3, 4 , 1, 6, 10};
		System.out.print("Arr is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("min number is: " + min);
	}

}
