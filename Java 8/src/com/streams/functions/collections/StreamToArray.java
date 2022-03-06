package com.streams.functions.collections;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {

	public static void main(String[] args) {

		List<Integer> listOfMarks = Arrays.asList(45, 50, 30, 35, 40, 0, 10, 15, 20, 25);

		System.out.println(listOfMarks);

		Integer[] array = listOfMarks.stream().sorted().toArray(size -> new Integer[size]);

		for (Integer i : array) {
			System.out.println(i);
		}

		Integer[] array1 = listOfMarks.stream().sorted().toArray(Integer[]::new);

		for (Integer i : array1) {
			System.out.println(i);
		}

	}
}
