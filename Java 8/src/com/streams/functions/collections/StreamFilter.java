package com.streams.functions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		
		List<Integer> listOfnumbers = Arrays.asList(0, 10, 15, 20, 25, 30, 35, 40, 45, 50);
		
		System.out.println(listOfnumbers);

		List<Integer> processedListOfnumbers = listOfnumbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		// Filter (Boolean / Predicate - FI)---> Filtering --> remove all odd numbers and hold only even objects

		System.out.println(processedListOfnumbers);
	}
}

