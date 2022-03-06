package com.map;

public class MyHashSetTest {

	public static void main(String[] args) {

		MyHashSet<Integer> set = new MyHashSet<Integer>();

		System.out.println(set.set(null)); // true
		set.set(1);
		set.set(2);
		set.set(3);
		System.out.println(set.set(1)); // false

		System.out.println(set); // [null, 1, 2, 3]

		System.out.println(set.remove(2)); // true
		System.out.println(set.remove(2)); // false

		System.out.println(set); // [null, 1, 3]

	}

}
