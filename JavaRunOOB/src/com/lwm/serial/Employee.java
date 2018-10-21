package com.lwm.serial;

import java.io.Serializable;

public class Employee implements Serializable{
	public String name;
	public String address;
	public transient int ssn;
	public int number;
}
