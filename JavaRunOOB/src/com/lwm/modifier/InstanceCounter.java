package com.lwm.modifier;

public class InstanceCounter {
	
	private static int numInstances;
	
	protected static int getCount(){
		return numInstances;
	}
	
	public static void addNumInstances(){
		numInstances ++;
	}
	
	public InstanceCounter(){
		InstanceCounter.addNumInstances();
	}

	public static void main(String[] args) {
		System.out.println(InstanceCounter.getCount());
		for(int i = 0; i < 500; i++){
			new InstanceCounter();
		}
		System.out.println(InstanceCounter.getCount());
	}

}
