package com.lwm.dateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo7 {

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date t;
		try {
			t = df.parse("1818-11-11");
			System.out.println(t);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
