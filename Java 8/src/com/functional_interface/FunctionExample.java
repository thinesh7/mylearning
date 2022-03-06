package com.functional_interface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

	public static void main(String[] args) {

		Function<Integer, Boolean> function = (number) -> {
			return (number % 2 == 0) ? false : true;
		};

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 7, 99, 55, 10);

		System.out.println(list.stream().sorted(Comparator.comparing(function)).collect(Collectors.toList()));
	}
}
