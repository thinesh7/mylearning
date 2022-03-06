package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		System.out.println(map.size()); // 0

		map.put("AAA", 1);
		map.put("BBB", 2);

		System.out.println(map.entrySet()); // [AAA=1, BBB=2]

		System.out.println(map.keySet()); // [AAA, BBB]

		map.forEach((k, v) -> {

		});
		
	}

}
