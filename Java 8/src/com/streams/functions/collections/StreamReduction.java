package com.streams.functions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduction {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 510, 20, 30, 5000, 4);

		// For Sum:
		// Integer sum = list.stream().reduce(2,Integer::sum);
		Integer sum = list.stream().reduce(2, (a, b) -> {
			System.out.println("a -> " + a + " + b-> " + b);
			return Integer.sum(a, b);
		});

		System.out.println("Sum of All values : " + sum);

		// For Max:
		Optional<Integer> max = list.stream().reduce(Integer::max);
		System.out.println("Max value : " + max.get());

	}
}

