package com.lwm.array;

import java.util.Arrays;

public class TestArrays2 {

	//�������ݣ����ݺ�����Ԫ��Ϊ0
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		a = Arrays.copyOf(a, a.length + 1);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
