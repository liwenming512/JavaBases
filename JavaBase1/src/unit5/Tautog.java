package unit5;

public class Tautog {

	public static void main(String[] args) {
		int a[][] = new int[][]{{3, 4, 3}, {1, 2}};
		System.out.println("二维数组是：");
		for (int x[]: a){
			for (int i : x) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
