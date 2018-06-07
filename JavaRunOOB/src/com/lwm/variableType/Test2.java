package com.lwm.variableType;

class C {
	
	static int i;
	
	public void change(int i1){
		i = i1;
	}
}

public class Test2 {

	public static void main(String[] args) {
		C.i = 10;
		C a = new C();
		C b = new C();
		System.out.println(C.i + "\t" + a.i +  "\t" + b.i);
		a.change(40);
		System.out.println(C.i + "\t" + a.i  + "\t" + b.i);
		b.i = b.i + 1;
		System.out.println(C.i + "\t" + a.i  + "\t" + b.i);
	}

}
