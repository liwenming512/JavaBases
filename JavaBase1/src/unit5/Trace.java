package unit5;

/*
 * 计算矩阵的迹（对角线数字之和）
 */

public class Trace {

	public static void main(String[] args) {
		int arr[][] = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println("矩阵：");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int tr = 0;
		for (int i = 0; i < arr.length; i++) {
			tr = tr + arr[i][i];
		}
		System.out.println("矩阵的迹:" + tr);
	}

}
