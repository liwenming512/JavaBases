package com.lwm.dateTime;

import java.util.Date;

public class SleepDemo {

	public static void main(String[] args) {
		try {
			System.out.println(new Date());
			Thread.sleep(3000);
			System.out.println(new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
