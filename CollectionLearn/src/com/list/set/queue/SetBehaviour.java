package com.list.set.queue;

import java.util.HashSet;
import java.util.Set;

public class SetBehaviour {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(null); // Null Allowed
		set.add(null);
		set.add(99);
		set.add(5);
		set.add(6);
		set.add(66); // Duplicate not allowed
		set.add(7);
		set.add(7);
		set.add(8); // Insertion order not preserved

		System.out.println(set); // [null, 66, 99, 5, 6, 7, 8] Based on hash code this will be saved ..!

		// Internally HashSet is using TreeSet..!

	}
}
