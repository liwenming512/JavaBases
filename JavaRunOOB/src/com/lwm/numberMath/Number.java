package com.lwm.numberMath;

public class Number {

	public static void main(String[] args) {
		// װ�䣬�൱�� Integer.valueOf(128);
		Integer i1 = 128;
		//�൱�� i1.intValue() ����
		int t = i1;
		System.out.println(t);
		
		/**
        	���ڨC128��127��Ĭ����127��֮���ֵ,��װ��󣬻ᱻ�����ڴ����������
        	����������������ֵ,ϵͳ������new һ������
        */
		Integer i2 = 200;
		Integer i3 = 200;
		
		/**
        	ע�� == �� equals������
        	== ���Ƚϵ��Ƕ���ĵ�ַ
        	equals �Ƚϵ��Ƕ��������
        */
		if (i2 == i3){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}

}
