package com.lwm.threads;

class RunnableDemo implements Runnable {
	
	private Thread t;
	
	private String threadName;
	
	RunnableDemo(String name){
		threadName = name;
		System.out.println("creating " + threadName);
	}

	@Override
	public void run() {
		for(int i = 4; i > 0; i--){
			
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
