package com.lwm.variableType;

//�����������������β��

public class Employee3 {
	
	public Employee3(String empName){
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
		Employee3 emp = new Employee3("Runboo");
		emp.setSalary(1000.0);
		emp.printEmp();
	}
	
	public String name;
	
	private double salary;

}
