package com.lean.map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<>();

		// Null Allowed in HashMap ->
		map.put(null, "1");
		map.put(null, "2"); // Duplicate null override -> {null=2}

		System.out.println(map);

		map.put(null, null);
		System.out.println(map); // {null=null}

		map.put("null2", null);
		System.out.println(map); // {null=null, null2=null}

		System.out.println("Hello".hashCode() + "  --  " + "Hello".hashCode());

		map.put("A", "1");
		map.put("Z", "1");
		map.put("U", "1");
		map.put("F", "1");
		System.out.println(map); // {null=null, A=1, U=1, F=1, Z=1, null2=null}

	}
}
