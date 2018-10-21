package com.lwm.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
	
	public static void testLinkedList(){
		List<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("World");
		list.add("AHAHAH");
		list.add("AHAHAH");
		for(String str: list){
			System.out.println(str);
		}
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for(int i = 0; i < strArray.length; i++){
			System.out.println(strArray[i]);
		}
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("Hello");
//		list.add("World");
//		list.add("AHAHAH");
//		for(String str: list){
//			System.out.println(str);
//		}
//		String[] strArray = new String[list.size()];
//		list.toArray(strArray);
//		for(int i = 0; i < strArray.length; i++){
//			System.out.println(strArray[i]);
//		}
//		Iterator<String> ite = list.iterator();
//		while(ite.hasNext()){
//			System.out.println(ite.next());
//		}
		testLinkedList();
	}

}
