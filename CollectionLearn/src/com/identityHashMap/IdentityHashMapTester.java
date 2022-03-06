package com.identityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapTester {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i1.equals(i2)); // true
		
		// It does equals comaparison 
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(i1, "Added i1");
		map.put(i2, "Added i2");
		
		System.out.println(map); // {1=Added i2}
		
		
		// --> IdentityHashMap does == comparison ..! 
		System.out.println(i1==i2); // false
		map = new IdentityHashMap<>();
		map.put(i1, "Added i1");
		map.put(i2, "Added i2");
		
		System.out.println(map);  // {1=Added i2, 1=Added i1}
		
	}
}
