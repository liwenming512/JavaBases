package com.lwm.dateTime;

import java.util.Date;

public class DateDemo4 {

	public static void main(String[] args) {
		// ��ʼ�� Date ����
	    Date date = new Date();
	    // ʹ��toString()��ʾ���ں�ʱ��
	    System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
	}

}
