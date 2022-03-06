package com.treemap;

import java.util.TreeMap;

class A {

}

class B extends A {

}

public class TreeMapTester {

	public static void main(String[] args) {

		TreeMap<Integer, String> intTreeMap = new TreeMap<>();

		intTreeMap.put(1, "one");
		intTreeMap.put(1, "one - new");
		intTreeMap.put(1, "one - ,.");

		System.out.println(intTreeMap); // {1=one - ,.}

		intTreeMap.ceilingEntry(5);

	}

}
