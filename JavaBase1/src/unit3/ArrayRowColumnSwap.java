package unit3;

/*
 * ת�þ���
 */

public class ArrayRowColumnSwap {

	public static void main(String[] args) {
		int arr[][] = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println("ת��ǰ����");
		printArray(arr);
		int arr2[][] = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr2[j][i] = arr[i][j];
			}
		}
		System.out.println("ת�ú����");
		printArray(arr2);
	}
	
	public static void printArray(int[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
