package com.code;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibanocTester {

	public static void main(String[] args) {

		// 1 1 2 3 5 8 13 21 ..!

		int[] intArray = new int[50];
		intArray[0] = 1;
		intArray[1] = 1;

		for (int i = 2; i < intArray.length; i++) {
			int temp = intArray[i - 1] + intArray[i - 2];
			intArray[i] = temp;
		}

		List<Integer> collect = IntStream.range(0, intArray.length).mapToObj(i -> intArray[i])
				.collect(Collectors.toList());

		System.out.println(collect);
		System.out.println(collect.indexOf(144));

	}

}
