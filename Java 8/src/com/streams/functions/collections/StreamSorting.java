package com.streams.functions.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(100, 50, 32, 20, 25, 45, 10, 55, 60, 90, 30, 35, 40);

		System.out.println("Initially - " + marks);

		// 1. Default:
		List<Integer> defaultSortedMarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("After - Default " + defaultSortedMarks);

		// 1. Customized:
		List<Integer> custSortedMarks = marks.stream().sorted((i1, i2) -> {
			return (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;
		}).collect(Collectors.toList());
		System.out.println("After - Customized " + custSortedMarks);

		// 2. Customized:
		List<Integer> custSortedMarks1 = marks.stream().sorted((i1, i2) -> {
			return -(i1.compareTo(i2));
		}).collect(Collectors.toList());
		System.out.println("After - Customized " + custSortedMarks1);
		
		// 3. Customized:
		System.out.println(marks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println(marks.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
		
		marks.stream().sorted(Comparator.reverseOrder()).forEach((m)->System.out.println(m));
	}
}
