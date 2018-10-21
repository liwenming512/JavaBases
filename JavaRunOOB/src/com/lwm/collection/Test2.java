package com.lwm.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		for(String key: map.keySet()){
			System.out.println(key + "\t" + map.get(key));
		}
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		for(Map.Entry<String, String> entry: map.entrySet()){
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		for(String value: map.values()){
			System.out.println(value);
		}
	}

}
