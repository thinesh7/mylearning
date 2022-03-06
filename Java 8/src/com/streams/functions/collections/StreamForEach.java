package com.streams.functions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamForEach {

	public static void main(String[] args) {

		List<Integer> listOfMarks = Arrays.asList(45, 50, 30, 35, 40, 0, 10, 15, 20, 25);

		System.out.println(listOfMarks);

		Consumer<Integer> con = (i) -> {
			System.out.println("The square of "+i+" is :"+i*i);
		};

		listOfMarks.stream().sorted().forEach(con); System.out.println();
		
		listOfMarks.stream().sorted().forEach((i)-> {System.out.println("The +5 of "+i+" is :"+(i+5));});
		
		listOfMarks.stream().sorted().forEach(System.out::println);
	}
}
