package com.lwm.dateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

	public static void main(String[] args) {
		String months[] = {
			      "Jan", "Feb", "Mar", "Apr",
			      "May", "Jun", "Jul", "Aug",
			      "Sep", "Oct", "Nov", "Dec"};
		int year;
		GregorianCalendar gCalendar = new GregorianCalendar();
		System.out.print("Date: ");
		System.out.print(months[gCalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gCalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gCalendar.get(Calendar.YEAR));
		System.out.print("Time:");
		System.out.print(gCalendar.get(Calendar.HOUR_OF_DAY) + ":");
		System.out.print(gCalendar.get(Calendar.MINUTE) + ":");
		System.out.print(gCalendar.get(Calendar.SECOND));
		if(gCalendar.isLeapYear(year)){
			System.out.println("闰年");
		}else{
			System.out.println("不是闰年");
		}
	}

}
