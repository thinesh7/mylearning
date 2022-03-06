package com.hashtable;

import java.util.HashMap;
import java.util.Map;

public class HashTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setName("Thinesh");

		Employee emp2 = new Employee();
		emp2.setName("Ramky");

		System.out.println(emp1 + " " + emp1.hashCode());
		System.out.println(emp2 + " " + emp2.hashCode());
		
		
		Map<Employee, String> map = new HashMap<>();
		map.put(emp1, "1");
		map.put(emp2, "2");
		
		System.out.println(map);
	}

}
