package com.functional_interface;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> p = (num) -> num % 2 == 0;

		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).filter(p).collect(Collectors.toList()));
	}
}
