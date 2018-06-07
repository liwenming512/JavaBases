package com.lwm.array;

import java.util.Arrays;

public class TestArrays {
	
	public static void output(int[] array){
		if (array != null){
			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] array = new int[5];
		//数组元素全赋值5
		Arrays.fill(array, 5);
		output(array);
		
		//第2-3个元素赋值8
		Arrays.fill(array, 2, 4, 8);
		output(array);
		
		int[] array1 = {7, 8, 3, 2, 12, 6, 3, 5, 4};
		//第2-6个元素排序
		Arrays.sort(array1, 2, 7);
		output(array1);
		
		//对整个数组排序
		Arrays.sort(array1);
		output(array1);
		
		//判断数组是否相等
		System.out.println(Arrays.equals(array, array1));
		int[] array2 = array1.clone();
		System.out.println(Arrays.equals(array1, array2));
		
		//使用二分搜索算法查找指定元素所在的下标（必须是排序好的，否则结果不正确）
		Arrays.sort(array1);
		System.out.println(Arrays.binarySearch(array1, 3));
		System.out.println(Arrays.binarySearch(array1, 9));
	}

}
