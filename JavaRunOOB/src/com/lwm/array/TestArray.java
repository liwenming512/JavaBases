package com.lwm.array;

public class TestArray {

	public static void main(String[] args) {
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		for(int i = 0; i < myList.length; i++){
			System.out.println(myList[i]);
		}
		double total = 0;
		for(int i = 0; i < myList.length; i++){
			total = total + myList[i];
		}
		double max = myList[0];
		System.out.println(total);
		for(int i = 1; i < myList.length; i++){
			if (myList[i] > max){
				max = myList[i];
			}
		}
		System.out.println(max);
	}

}
