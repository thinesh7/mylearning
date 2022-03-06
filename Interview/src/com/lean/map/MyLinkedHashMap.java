package com.lean.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {

	public static void main(String[] args) {

		Map<String, Object> map = new LinkedHashMap<>();

		map.put("2", "16");
		map.put(null, "10");
		map.put("1", "1");
		map.put("3", "19");
		map.put("3", "19");
		

		System.out.println(map); // {2=16, null=10, 1=1, 3=19} -> Order Preserved 
		
		map.put("9", null);
		map.put("8", null);

		System.out.println(map); // {2=16, null=10, 1=1, 3=19, 9=null, 8=null}
	}

}
