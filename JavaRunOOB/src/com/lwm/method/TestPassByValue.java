package com.lwm.method;

public class TestPassByValue {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		System.out.println(n1 + "\t" + n2);
		swap(n1, n2);
		System.out.println(n1 + "\t" + n2);
	}

	//�����ǰ�ֵ���ݵģ�n1��n2Ϊ�βΣ��ʽ�����ʵ�β�δ��������
	public static void swap(int n1, int n2){
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
}
