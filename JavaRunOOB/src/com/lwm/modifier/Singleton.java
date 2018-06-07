package com.lwm.modifier;

public class Singleton {
	
	private volatile static Singleton instance = null;
	
	public static Singleton getInstance(){
		if (instance == null){
			synchronized(Singleton.class){
				if (instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
