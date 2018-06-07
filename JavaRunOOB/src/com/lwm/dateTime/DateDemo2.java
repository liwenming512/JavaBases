package com.lwm.dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		Date dNow = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(dNow));
	}

}
