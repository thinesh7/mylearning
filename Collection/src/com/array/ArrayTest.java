package com.array;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {

		Object[] ObjectArray = { "v", 1, 'c', true };

		System.out.println(ObjectArray);

		List<Object> asList = Arrays.asList(ObjectArray);

		System.out.println(asList);

		int[] intArray = { 5, 5, 8, 9 };
		int[] intArray2 = new int[5];

		System.out.println(intArray2.length);

		intArray2[0] = 1;
		intArray2[1] = 1;
		intArray2[2] = 1;
		intArray2[3] = 1;
		intArray2[4] = 1;
		// intArray2[5] = 1; -> java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		System.out.println(intArray2); // -> [I@6f75e721
		
	}

}
