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
		//����Ԫ��ȫ��ֵ5
		Arrays.fill(array, 5);
		output(array);
		
		//��2-3��Ԫ�ظ�ֵ8
		Arrays.fill(array, 2, 4, 8);
		output(array);
		
		int[] array1 = {7, 8, 3, 2, 12, 6, 3, 5, 4};
		//��2-6��Ԫ������
		Arrays.sort(array1, 2, 7);
		output(array1);
		
		//��������������
		Arrays.sort(array1);
		output(array1);
		
		//�ж������Ƿ����
		System.out.println(Arrays.equals(array, array1));
		int[] array2 = array1.clone();
		System.out.println(Arrays.equals(array1, array2));
		
		//ʹ�ö��������㷨����ָ��Ԫ�����ڵ��±꣨����������õģ�����������ȷ��
		Arrays.sort(array1);
		System.out.println(Arrays.binarySearch(array1, 3));
		System.out.println(Arrays.binarySearch(array1, 9));
	}

}
