package unit3;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter one year:");
		Long Year = scanner.nextLong();
		if (Year % 4 == 0 && Year % 100 == 0||Year % 400 == 0){
			System.out.println(Year + ",LeapYear!");
		}
		else{
			System.out.println(Year + ", not a LeapYear!");
		}
		scanner.close();
	}

}
