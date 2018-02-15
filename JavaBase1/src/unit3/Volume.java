package unit3;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.1415926;
		System.out.println("Enter Volume r:");
		double r = scanner.nextDouble();
		double Volume = 4.0/3.0 * PI * r * r * r;
		System.out.println("Ball r=" + r);
		System.out.println("PI=" + PI);
		System.out.println("Volume =" + Volume);
		scanner.close();
	}

}
