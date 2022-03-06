package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class HashMapKeyTest {

	public static void main(String[] args) {

		// 1.
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(Integer.valueOf(1), "one");
		hashMap.put(Integer.valueOf(2), "two");
		hashMap.put(Integer.valueOf(3), "three");
		hashMap.put(Integer.valueOf(3), "three Duplicate");

		System.out.println(hashMap.get(3)); // three Duplicate

		System.out.println(Integer.valueOf(3).hashCode());
		System.out.println(Integer.valueOf(3).hashCode());

		// 2.
		Map<String, String> map = new HashMap<>();

		String s1 = new String("one");
		String s2 = new String("one");

		System.out.println(s1.hashCode() + " " + s2.hashCode()); // 110182 110182

		map.put(s1, "1");
		map.put(s2, "duplicate 1");

		System.out.println(map); // {one=duplicate 1}

		// 3.
		System.out.println("----");

		Employee emp1 = new Employee();
		emp1.setName("Thinesh");

		Employee emp2 = new Employee();
		emp2.setName("Ramky");

		Employee emp3 = new Employee();
		emp3.setName("Poongodi");

		Employee emp4 = new Employee();
		emp4.setName("Thinesh");

		System.out.println(emp1 + " " + emp1.hashCode() + "  " + emp2 + " " + emp2.hashCode() + " " + emp3 + " "
				+ emp3.hashCode() + emp1 + " " + emp1.hashCode());
		// Thinesh 123456789 Ramky 123456789 Poongodi 123456789

		Map<Employee, String> empMap = new HashMap<>();
		System.out.println("put -> " + empMap.put(emp1, "1")); // put -> null
		System.out.println("put -> " + empMap.put(emp2, "2")); // put -> null
		System.out.println("put -> " + empMap.put(emp3, "3"));
		System.out.println("put -> " + empMap.put(emp4, "1 duplicate")); // Duplicate -> replaced with 1 duplicate

		System.out.println(empMap); // {Thinesh=1 duplicate, Ramky=2, Poongodi=3}

		System.out.println(new ArrayList(empMap.entrySet())); // [Thinesh=1 duplicate, Ramky=2, Poongodi=3]
		
		System.out.println(empMap.remove(emp3)); // 3
		
		System.out.println(empMap); // {Thinesh=1 duplicate, Ramky=2}
		
		List<String> list = new LinkedList<String>();
		
	}
}
