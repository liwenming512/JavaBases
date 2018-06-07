package com.lwm.dateTime;

import java.util.Date;

public class DiffDemo {

	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			Thread.sleep(3000);
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println(diff);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
