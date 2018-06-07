package com.lwm.basicGrammer;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 类型转换中的一些问题
 */

public class LeiXingZhuanHuan {
	
	/*
	 * Java 里使用 long 类型的数据一定要在数值后面加上 L，否则将作为整型解析
	 */
	public static void LongType(){
		long g = 9223372036854775807L;
		long h = -9223372036854775808L;
		System.out.println(g);
		System.out.println(h);
	}
	
	/*
	 * 在java的世界里，如果比int类型小的类型做运算，java在编译的时候就会将它们统一强转成int类型。
	 * 当是比int类型大的类型做运算，就会自动转换成它们中最大类型那个。
	 */
	public static void ShortType(){
		short a = 1;
		short b = 2;
		Object o = a + b;
		System.out.println(o.getClass());
	}
	
	/*
	 * 1、包装类过渡类型转换
	 * 一般情况下，我们首先声明一个变量，然后生成一个对应的包装类，就可以利用包装类的各种方法进行类型转换了
	 */
	public static void BoxTypeTranform(){
		float f1 = 100.00f;
		Float f2 = new Float(f1);
		double d1 = f2.doubleValue();
		System.out.println(d1);
	}
	
	/* 2、字符串与其它类型间的转换
	 调用类的串转换方法:X.toString();
	 自动转换:X+"";
	 使用String的方法:String.valueOf(X);
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
	 * 字符串作为值,向其它类型的转换
	 * 1、先转换成相应的封装器实例,再调用对应的方法转换成其它类型
	 * 2、静态parseXXX方法
	 * 3、Character的getNumericValue(char ch)方法
	 * 4、Date类与其它数据类型的相互转换
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
	 * Date类与其它数据类型的相互转换
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
