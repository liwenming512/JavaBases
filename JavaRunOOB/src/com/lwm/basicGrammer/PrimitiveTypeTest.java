package com.lwm.basicGrammer;

public class PrimitiveTypeTest {

	public static void main(String[] args) {
		//byte
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println();
		
		//short
		System.out.println(Short.SIZE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println();
		
		//int
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println();
		
		//long
		System.out.println(Long.SIZE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println();
		
		//float
		System.out.println(Float.SIZE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println();
		
		//double
		System.out.println(Double.SIZE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println();
		
		//char
		System.out.println(Character.SIZE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		
		int i = 128;
		byte b = (byte) i;
		System.out.println(b);
	}

}
