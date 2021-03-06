package com.test;

import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		Integer[] intArray = { 72, 34, 56, 23, 87, 31, 233, 12 };

		// Sum of Even num -> Java 8

		List<Integer> intArrayList = Arrays.asList(intArray);

		System.out.println(intArrayList.stream().filter(x -> (x % 2 == 0)).reduce((a, b) -> {
			System.out.println(a + " " + b);
			return a + b;
		}).get());

	}

}
