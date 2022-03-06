package com.hashMap;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMap<Employee, String> treeMap = new TreeMap<>();

		Employee emp1 = new Employee();
		emp1.setName("A");

		Employee emp2 = new Employee();
		emp2.setName("B");

		Employee emp3 = new Employee();
		emp3.setName("C");

		Employee emp4 = new Employee();
		emp4.setName("A");

		System.out.println(emp1 + " " + emp1.hashCode() + "  " + emp2 + " " + emp2.hashCode() + " " + emp3 + " "
				+ emp3.hashCode() + " " + emp4 + " " + emp4.hashCode());
		// A 123456789 B 123456789 C 123456789 A 123456789

		// System.out.println(treeMap.put(null, null)); -> Null Key cannot be added

		System.out.println(treeMap.put(emp1, "1")); // null
		System.out.println(treeMap.put(emp2, "2")); // null
		System.out.println(treeMap.put(emp3, "3")); // null
		System.out.println(treeMap.put(emp4, " Duplicate - 1 ")); // 1

		System.out.println(treeMap); // {A= Duplicate - 1 , B=2, C=3}

	}

}
