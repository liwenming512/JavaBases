package com.lwm.dateTime;

import java.util.Calendar;

public class DateDemo8 {
	
	public static void printCalendar(Calendar c){
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "\t" + month + "\t" + date + "\t" +
				hour + "\t" + minute + "\t" + second + "\t" + day);
	}

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		printCalendar(c1);
		c1.set(2009, 6, 12);
		printCalendar(c1);
		c1.set(Calendar.DATE, 10);
		printCalendar(c1);
		c1.set(Calendar.YEAR, 2008);
		printCalendar(c1);
		c1.add(Calendar.DATE, 10);
		printCalendar(c1);
		c1.add(Calendar.DATE, -10);
		printCalendar(c1);
	}

}
