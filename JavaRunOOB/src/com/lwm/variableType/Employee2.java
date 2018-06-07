package com.lwm.variableType;

public class Employee2 {
	
	static class testClass{
		public static void printSalary(){
			System.out.println(Employee2.DEPARTMENT + "\t" + Employee2.salary);
		}
	};
	
	private static double salary;
	
	private static final String DEPARTMENT = "开发人员";

	public static void main(String[] args) {
		salary = 1000;
		System.out.println(DEPARTMENT + "\t" + salary);
		testClass.printSalary();
	}

}
