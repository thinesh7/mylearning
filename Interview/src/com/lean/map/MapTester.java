package com.lean.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MapTester {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("1", 1);
		map.put(null, null);
		map.put("3", 3);
		map.put("", 4);

		System.out.println(map);

		System.out.println("---------");

		Predicate<String> p1 = (x) -> null != x;
		Predicate<String> p2 = (x) -> "" != x;

		Predicate<String> p1AndP2 = p1.and(p2);

		map.keySet().stream().filter(p1AndP2).forEach(x -> {
			System.out.println(x.length());
		});

		System.out.println("---------");

		map.values().stream().filter(x -> null != x).forEach(x -> {
			System.out.println(x);
		});

		System.out.println("---------");

		Map<Employee, Integer> mapList = new HashMap<>();

		Employee emp1 = new Employee();
		emp1.setName("qq-1");

		mapList.put(emp1, 1);
		System.out.println(mapList); // Comparing--> Current Obj qq, Checking with qq1 false

		Employee emp2 = new Employee();
		emp2.setName("qq-2");

		mapList.put(emp2, 2);
		System.out.println(mapList);

		Employee emp3 = new Employee();
		emp3.setName("qq-3");

		mapList.put(emp3, 3);
		System.out.println(mapList);

		Employee emp4 = new Employee();
		emp4.setName("qq-3");

		mapList.put(emp4, 4);
		System.out.println(mapList);

		/*
		 * {qq-1=1} 
		 * Comparing--> Current Obj qq-2, Checking with qq-1 false 
		 * {qq-1=1,qq-2=2} 
		 * Comparing--> Current Obj qq-3, Checking with qq-1 false 
		 * Comparing--> Current Obj qq-3, Checking with qq-2 false 
		 * {qq-1=1, qq-2=2, qq-3=3} 
		 * Comparing--> Current Obj qq-3, Checking with qq-1 false
		 * Comparing--> Current Obj qq-3, Checking with qq-2 false 
		 * Comparing--> Current Obj qq-3, Checking with qq-3 true 
		 * {qq-1=1, qq-2=2, qq-3=4}
		 */
		
		
		System.out.println("----------------");
		
		
		emp2.setName("qq-2 --> NEW");
		
		System.out.println(mapList); // {qq-1=1, qq-2 --> NEW, qq-3=4}
	}

}
