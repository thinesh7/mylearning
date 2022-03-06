package com.streams.functions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(100, 50, 32, 20, 25, 45, 10, 55, 60, 90, 30, 35, 40);

		// Get Min and Max by Ascending order:
		System.out.println(marks.stream().sorted().collect(Collectors.toList()));

		int min = marks.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);

		int max = marks.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);

		// Get Min and Max by descending order:
		System.out.println();
		System.out.println(marks.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList()));

		int min1 = marks.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println(min1);

		int max1 = marks.stream().max((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println(max1);
	}
}
