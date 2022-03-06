package com.set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<>();

		// System.out.println(tree.add(null)); - > Null cannot be added -> Bcz of
		// sorting

		System.out.println(tree.add("AAA"));
		System.out.println(tree.add("AAA")); // Duplicate not allowed
		System.out.println(tree); // [AAA]

		/*
		 * Doesn't allow duplicate -> Stored on some order
		 * 
		 * TreeMap does not use hashing for storing key unlike the HashMap and
		 * LinkedHashMap use hashing for storing the key
		 */

	}

}
