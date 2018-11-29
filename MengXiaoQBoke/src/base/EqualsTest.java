package base;

import java.util.HashMap;

public class EqualsTest {

	public static void test1(){
		String s1, s2, s3 = "abc", s4 = "abc";
		s1 = new String("abc");
		s2 = new String("abc");
		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}
	
	public static void test2(){
		int a = 3;
		int b = 4;
		int c = 3;
		System.out.println(a == b);
		System.out.println(a == c);
//		System.out.println(a.equals(c));
	}
	
	public static void test3(){
		Integer n1 = new Integer(30);
		Integer n2 = new Integer(30);
		Integer n3 = new Integer(31);
		System.out.println(n1 == n2);
		System.out.println(n1 == n3);
		System.out.println(n1.equals(n2));
		System.out.println(n1.equals(n3));
	}

	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
		HashMap hm = new HashMap();
	}

}
