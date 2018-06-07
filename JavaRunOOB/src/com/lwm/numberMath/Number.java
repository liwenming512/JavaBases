package com.lwm.numberMath;

public class Number {

	public static void main(String[] args) {
		// 装箱，相当于 Integer.valueOf(128);
		Integer i1 = 128;
		//相当于 i1.intValue() 拆箱
		int t = i1;
		System.out.println(t);
		
		/**
        	对于–128到127（默认是127）之间的值,被装箱后，会被放在内存里进行重用
        	但是如果超出了这个值,系统会重新new 一个对象
        */
		Integer i2 = 200;
		Integer i3 = 200;
		
		/**
        	注意 == 与 equals的区别
        	== 它比较的是对象的地址
        	equals 比较的是对象的内容
        */
		if (i2 == i3){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}

}
