package com.Arrays.as;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharArrayTest {

	public static void main(String[] args) {

		// 1.

		char[] charArray = { '1', '2', '3', '4' };

		List<char[]> asList = Arrays.asList(charArray);
		System.out.println(asList); // [[C@5aaa6d82]
		System.out.println(asList.get(0)[2]); // 3

		Character[] charArray1 = { 'a', 'v' };
		List<Character> asList0 = Arrays.asList(charArray1);
		System.out.println(asList0); // [a, v]

		// 2.

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };

		List<int[]> asList2 = Arrays.asList(intArray);
		System.out.println(asList2); // [[I@6f75e721]

		// 3.

		Integer[] intArray1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> asList3 = Arrays.asList(intArray1);
		System.out.println(asList3); // [1, 2, 3, 4, 5, 6, 7, 8]

		System.out.println("---");

		// 4.

		char[] charArrayy = "Thinesh".toCharArray();
		char[] charArrayy1 = "Thinesh".toCharArray();

		List<Character> collect = IntStream.range(0, charArrayy.length).mapToObj(i -> charArrayy1[i])
				.collect(Collectors.toList());

		System.out.println(collect); // [T, h, i, n, e, s, h]

		IntStream.range(0, 5).forEach(x -> System.out.print(x + " ")); // 0 1 2 3 4

	}

}
