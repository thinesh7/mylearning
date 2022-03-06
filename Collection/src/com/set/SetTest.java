package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setName("Thinesh");

		Employee emp2 = new Employee();
		emp2.setName("Ramky");

		Employee emp3 = new Employee();
		emp3.setName("Thinesh");

		System.out.println(
				emp1 + " " + emp1.hashCode() + " " + emp2 + " " + emp2.hashCode() + " " + emp3 + " " + emp3.hashCode());
		// Thinesh 123456789 Ramky 123456789 Thinesh 123456789

		Set<Employee> set = new HashSet<>();

		System.out.println(set.add(emp1)); // true
		System.out.println(set.add(emp2)); // true
		System.out.println(set.add(emp3)); // false

		System.out.println(set); // [Thinesh, Ramky]

		// Allow null for once
		// Doesn't allow duplicate -> .equals comparison
		// if same hascode -> same concept of HashMap
		// Internally uses HashMap
		// Insertion order - Preserved

		// 0.75 Load Factor -> 16 capacity
		// Stores key -> index based on hash code * (n-1)

	}
}
