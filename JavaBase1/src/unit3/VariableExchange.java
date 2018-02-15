package unit3;

import java.util.Scanner;

public class VariableExchange {

	public static void main(String[] args) {
		Scanner san = new Scanner(System.in);
		long A = san.nextLong();
		long B = san.nextLong();
		A = A ^ B;
		B = B ^ A;
		A = A ^ B;
		System.out.println(A);
		System.out.println(B);
	}

}
