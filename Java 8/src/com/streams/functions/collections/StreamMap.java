package com.streams.functions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		List<Integer> listOfMarks = Arrays.asList(0, 10, 15, 20, 25, 30, 35, 40, 45, 50);

		System.out.println(listOfMarks);

		List<Integer> processedlistOfMarks = listOfMarks.stream().map(i -> i + 5).collect(Collectors.toList());

		// Map (Perform some function to all object - FI)---> Mapping -->Add +5 grace marks to all marks

		System.out.println("+5 " + processedlistOfMarks);

		List<Integer> processedlistOfMarks1 = listOfMarks.stream().map(i -> i + 2).collect(Collectors.toList());

		System.out.println("+2 " + processedlistOfMarks1);

	}
}

