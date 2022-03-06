package com.streams.functions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduce {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 510, 20, 30, 5000, 4);

		// 1. MapToInt
		IntStream mapToInt = list.stream().mapToInt((i) -> i);
		IntStream of = IntStream.of(1, 2, 3, 4);

		// 2. IntStream - > Sum Method
		int sum = list.stream().mapToInt((i) -> i).sum();
		System.out.println(sum);

		// 3. Reduce method - 1
		Integer reducedSum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(reducedSum);

		// 4. Reduce method - 2
		list = Arrays.asList();
		Optional<Integer> reducedOptSum = list.stream().reduce(Integer::sum);
		System.out.println(reducedOptSum.orElse(0));

		// 5. Reduce method
		list = Arrays.asList(10, 510, 20, 30, 5000, 4);
		Integer mul = list.stream().reduce(1, (a, b) -> a * b);
		System.out.println(mul);

		Integer max = list.stream().reduce(0, (a, b) -> {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		});

		System.out.println(max);
		System.out.println(list.stream().reduce(Integer::max).get());

		Stream<String> names = Stream.of("A", "AAA", "AA", "AAAA", "Thinesh");

		String LongestName = names.reduce((a, b) -> a.length() > b.length() ? a : b).get();
		System.out.println(LongestName);

	}
}
