package com.lwm.modifier;

//？？没看出加volatile有区别

//volatile修饰符测试
public class VolatileTest implements Runnable {
	
	private volatile boolean active;
	
	public void run(){
		active = true;
		int i = 0;
		while(active){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
	
	public void stop(){
		active = false;
	}

	public static void main(String[] args) {
		VolatileTest test = new VolatileTest();
		Thread thread = new Thread(test);
		thread.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.stop();
	}

}
