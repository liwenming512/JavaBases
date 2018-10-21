package com.lwm.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream input = new FileInputStream("d://liwenming.ser");
			ObjectInputStream in = new ObjectInputStream(input);
			e = (Employee) in.readObject();
			in.close();
			input.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(e.name);
		System.out.println(e.address);
		System.out.println(e.number);
		System.out.println(e.ssn);
	}

}
