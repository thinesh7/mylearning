package com.streams.functions.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringSorting {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("TTTTTTT", "AAA", "C", "ZZZZ", "DDDDDDDD", "EEEEE", "AA", "DD", "CC", "BB");
		System.out.println(names);

		// 1. Default Sorting
		List<String> defaultSortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(defaultSortedNames);

		// 2. Customized Sorting:
		List<String> CustomizedSortedNames = names.stream().sorted((name1, name2) -> {
			return -(name1.compareTo(name2));
		}).collect(Collectors.toList());
		System.out.println(CustomizedSortedNames);

		// 3 Customized Sorting:
		Comparator<String> comparator = (n1, n2) -> {
			int l1 = n1.length();
			int l2 = n2.length();
			return (l1 > l2) ? -1 : (l1 < l2) ? 1 : n1.compareTo(n2); // if length same then alpha order is checking
		};

		List<String> sortingNameByLength = names.stream().sorted(comparator).collect(Collectors.toList());
		System.out.println(sortingNameByLength);

	}
}
