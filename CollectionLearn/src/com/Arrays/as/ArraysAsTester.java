package com.Arrays.as;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsTester {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);

		// asList.add(5); asList.remove(0); -> java.lang.UnsupportedOperationException

		/*
		 * Array.asList() wraps an array in the list interface. The list is still backed
		 * by the array. Arrays are a fixed size - they don't support adding or removing
		 * elements, so the wrapper can't either.
		 */

		// Best Way:

		List<Integer> intList = new ArrayList<>(asList);
		intList.remove(0);
		intList.add(99);
		System.out.println(intList);

	}
}
