package com.functional_interface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample {

	public static void main(String[] args) {

		// With Collections:
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFun = (l1, l2) -> {
			return Stream.of(l1, l2).flatMap(l -> l.stream()).distinct().collect(Collectors.toList());
		};

		Function<List<Integer>, List<Integer>> b1Fun2Sorted = list -> list.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(biFun.andThen(b1Fun2Sorted).apply(list1, list2));

		// Using BiFun in Map:

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("AAA", 500);
		map.put("BBB", 1500);
		map.put("CCC", 2500);
		map.put("DDD", 3500);

		BiFunction<String, Integer, Integer> b1Fun1Add = (k, v) -> v + 500;

		map.replaceAll(b1Fun1Add);

		System.out.println(map);

	}
}
