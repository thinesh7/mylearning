package com.hasset;

import java.util.HashSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		/*
		 * Underlying data structure is Hash Table:
		 * 
		 * Constructs a new, empty set; the backing {@code HashMap} instance has
		 * default initial capacity (16) and load factor (0.75).
		 * 
		 * Null allowed
		 * Duplicates Not allowed
		 * Insertion order is not preserved ..! This will be stored on basis of hashcode value
		 * 
		 * Internally uses HashMap
		 * 
		 * For Search it is Best
		 */
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		System.out.println(set.add(null)); // true
		System.out.println(set.add(null)); // false
		set.add(null);
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(660);
		set.add(99);
		
		System.out.println(set); // [null, 1, 2, 99, 660]
		
		set = new HashSet<Integer>(100); // Capacity of 100
		set = new HashSet<Integer>(100, 0.95f);// Capacity of 100 and load factor 0.95
		
		set.remove(5);
		
	}

}
