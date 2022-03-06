package com.streams.functions.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam {
	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(20, 25, 30, 34, 35, 40, 45, 50, 60, 90);
		System.out.println(marks);

		long countOfFail = marks.stream().filter(i -> i < 35).count();

		System.out.println(countOfFail + " Are failed So Add Grace Marks to this students");

		// Add Grace mark for failed students:
		List<Integer> updatedMarks = marks.stream().map(i -> {
			if (i < 35) {
				System.out.println(i + " Added +5");
				return i + 5;
			} else {
				return i;
			}
		}).collect(Collectors.toList());

		System.out.println(updatedMarks);
		System.out.println(updatedMarks.stream().filter(i -> i < 35).count() + " Are new failed count");
	}
}
