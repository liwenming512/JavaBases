package com.lwm.array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {26,15,29,66,99,88,36,77,111,1,6,8,8};
		for(int i = 0; i < arr.length - 1; i ++){
			for(int j = i + 1; j < arr.length; j++ ){
				if (arr[j] <= arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			String hint = "第" + (i + 1) + "次排序结果：";
			for(int k = 0; k < arr.length; k++){
				hint = hint + arr[k] + "\t";
			}
			System.out.println(hint);
		}
		String ret = "排序结果：";
		for(int i = 0; i < arr.length; i++){
			ret = ret + arr[i] + "\t";
		}
		System.out.println(ret);
	}

}
