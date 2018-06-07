package com.lwm.variableType;

public class Employee {
	
	public String name;
	
	private double salary;
	
	public Employee(String empName){
		name = empName;
	}
	
	public void setSalary(double empSal){
		salary = empSal;
	}
	
	public void printEmp(){
		System.out.println(this.name);
		System.out.println(this.salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Runboo");
		emp.setSalary(1000.0);
		emp.printEmp();
	}

}
