package com.lwm.dateTime;

import java.util.Date;

public class DateDemo5 {

	public static void main(String[] args) {
		 //��ʼ�� Date ����
	     Date date = new Date();
	     // ��ʾ��ʽ��ʱ��
	     System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
	}

}
