package com.lwm.basicGrammer;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ����ת���е�һЩ����
 */

public class LeiXingZhuanHuan {
	
	/*
	 * Java ��ʹ�� long ���͵�����һ��Ҫ����ֵ������� L��������Ϊ���ͽ���
	 */
	public static void LongType(){
		long g = 9223372036854775807L;
		long h = -9223372036854775808L;
		System.out.println(g);
		System.out.println(h);
	}
	
	/*
	 * ��java������������int����С�����������㣬java�ڱ����ʱ��ͻὫ����ͳһǿת��int���͡�
	 * ���Ǳ�int���ʹ�����������㣬�ͻ��Զ�ת������������������Ǹ���
	 */
	public static void ShortType(){
		short a = 1;
		short b = 2;
		Object o = a + b;
		System.out.println(o.getClass());
	}
	
	/*
	 * 1����װ���������ת��
	 * һ������£�������������һ��������Ȼ������һ����Ӧ�İ�װ�࣬�Ϳ������ð�װ��ĸ��ַ�����������ת����
	 */
	public static void BoxTypeTranform(){
		float f1 = 100.00f;
		Float f2 = new Float(f1);
		double d1 = f2.doubleValue();
		System.out.println(d1);
	}
	
	/* 2���ַ������������ͼ��ת��
	 ������Ĵ�ת������:X.toString();
	 �Զ�ת��:X+"";
	 ʹ��String�ķ���:String.valueOf(X);
	 */
	public static void OtherTypeToString(){
		boolean b = false;
		String bs1 = b + "";
		String bs2 = String.valueOf(b);
		System.out.println(bs1);
		System.out.println(bs2);
		
		Date date = new Date();
		String dates1 = date.toString();
		String dates2 = date + "";
		String dates3 = String.valueOf(date);
		System.out.println(dates1);
		System.out.println(dates2);
		System.out.println(dates3);		
	}

	/*
	 * �ַ�����Ϊֵ,���������͵�ת��
	 * 1����ת������Ӧ�ķ�װ��ʵ��,�ٵ��ö�Ӧ�ķ���ת������������
	 * 2����̬parseXXX����
	 * 3��Character��getNumericValue(char ch)����
	 * 4��Date���������������͵��໥ת��
	 */
	public static void StringToOtherType(){
		String s = "32.1";
		double d1 = new Float(s).doubleValue();
		double d2 = Double.valueOf(s).doubleValue();
		System.out.println(d1);
		System.out.println(d2);
		
		String s2 = "1";
		byte b = Byte.parseByte(s2);
		short sh = Short.parseShort(s2);
		int i = Integer.parseInt(s2);
		long l = Long.parseLong(s2);
		float f = Float.parseFloat(s2);
		double d = Double.parseDouble(s2);
		
		char c = 'f';
		int ci = Character.getNumericValue(c);
		System.out.println(ci);
	}

	/*
	 * Date���������������͵��໥ת��
	 */
	public static void DateToOtherType(){
		Date date1 = new Date(2018, 5, 27);
		Date date2 = new Date(2018, 5, 27, 17, 28);
		Date date3 = new Date(2018, 5, 27, 17, 28, 30);
		System.out.println(date1 + "\t" + date2 + "\t" + date3);
		
		Date date4 = new Date();
		System.out.println(date4.toString());
		System.out.println(date4.getYear() + "\t"+ date4.getMonth() + "\t" + 
				date4.getDay() + "\t" + date4.getHours() + "\t" + date4.getMinutes()
				+ "\t" + date4.getSeconds());
		long time = date4.getTime();
		System.out.println(time);
		Date date5 = new Date(time);
		System.out.println(date5.toString());
		
		Date date6 = new Date();
		SimpleDateFormat sy1 = new SimpleDateFormat("yyyyMMdd");
		String dateFormat = sy1.format(date6);
		System.out.println(dateFormat);
		SimpleDateFormat sy = new SimpleDateFormat("yyyy");
		SimpleDateFormat sm = new SimpleDateFormat("MM");
		SimpleDateFormat sd = new SimpleDateFormat("dd");
		String syear = sy.format(date6);
		String smonth = sm.format(date6);
		String sday = sd.format(date6);
		System.out.println(syear + "\t" + smonth + "\t" + sday);
		
	}
	
	public static void main(String[] args) {
//		OtherTypeToString();
//		StringToOtherType();
//		DateToOtherType();
		ShortType();
	}

}
