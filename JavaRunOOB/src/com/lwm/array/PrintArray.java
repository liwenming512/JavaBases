package com.lwm.array;

public class PrintArray {
	
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static int[] reverseArray(int[] array){
		int[] retList = new int[array.length];
		for(int i = 0; i < array.length; i++){
			retList[i] = array[array.length - i - 1];
		}
		return retList;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		printArray(array);
		int[] newArray = reverseArray(array);
		printArray(newArray);
	}

}
