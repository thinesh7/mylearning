package com.weekhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class A {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Obj destroyed ..!");
		super.finalize();
	}

	@Override
	public String toString() {
		return "A";
	}
}

public class WeekHashMapTester {

	public static void main(String[] args) {
		A temp = new A();

		Map<A, String> map = new WeakHashMap<>();
		map.put(temp, "Added");

		System.out.println(map); // {A=Added}

		temp = null;
		System.gc(); // Obj destroyed ..!

		System.out.println(map); // {}

		// ----

		temp = new A();
		map = new HashMap<>();
		map.put(temp, "Added");

		System.out.println(map); // {A=Added}
		temp = null;
		System.gc();

		System.out.println(map); // {A=Added}
	}

}
