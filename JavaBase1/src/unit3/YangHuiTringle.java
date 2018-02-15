package unit3;

/*
 * Êä³öÑî»ÔÈý½Ç
 */
import java.util.Scanner;

public class YangHuiTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a Number:");
		int num = scanner.nextInt();
		scanner.close();
		int tringleArr[][] = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j > i){
					tringleArr[i][j] = 0;
				}else if ((j == 0)||(i == j)){
					tringleArr[i][j] = 1;
				}
				else {
					tringleArr[i][j] = tringleArr[i - 1][j] + tringleArr[i - 1][j - 1];
				}
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (tringleArr[i][j] == 0){
					System.out.print("\t");
				}
				else{
					System.out.print(tringleArr[i][j] + "\t");
				}
				if (j == num - 1){
					System.out.print("\n");
				}
			}
		}
	}

}
