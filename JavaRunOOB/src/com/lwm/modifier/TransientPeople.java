package com.lwm.modifier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class People implements Serializable{
	
	String name;
	
	transient int age;
	
	public People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "name:" + name + "\t" + "age:" + age;
	}
}

public class TransientPeople {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {		
		People people = new People("liwenming", 32);
		System.out.println(people.toString());
		//序列化
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d://people.txt"));
		os.writeObject(people);
		os.close();
		//反序列化
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("d://people.txt"));
		people = (People) is.readObject();
		is.close();
		System.out.println(people.toString());
	}

}
