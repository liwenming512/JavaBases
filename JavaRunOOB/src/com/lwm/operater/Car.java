package com.lwm.operater;

class Vehicle{};

public class Car extends Vehicle {

	public static void main(String[] args) {
		Vehicle car = new Car();
		boolean b = car instanceof Vehicle;
		System.out.println(b);
	}

}
