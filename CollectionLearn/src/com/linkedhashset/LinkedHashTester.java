package com.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashTester {
	
	public static void main(String[] args) {
		
		/*
		 * Underlying data structure is Hash Table and Linked List:
		 * 
		 * Constructs a new, empty set; the backing {@code HashMap} instance has
		 * default initial capacity (16) and load factor (0.75).
		 * 
		 * Null allowed
		 * Duplicates Not allowed
		 * Insertion order preserved ..!
		 * 
		 * Internally uses LinkedHashMap
		 * 
		 */
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		System.out.println(set.add(null)); // true
		System.out.println(set.add(null)); // false
		set.add(null);
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(660);
		set.add(99);
		
		System.out.println(set); // [null, 1, 2, 660, 99]
		
		set = new LinkedHashSet<Integer>(100); // Capacity of 100
		set = new LinkedHashSet<Integer>(100, 0.95f);// Capacity of 100 and load factor 0.95
		
	}

}
