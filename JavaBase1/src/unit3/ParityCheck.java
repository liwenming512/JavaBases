package unit3;

import java.util.Scanner;

public class ParityCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		boolean b = (number % 2 == 0)?true:false;
		System.out.println(b);
	}

}
