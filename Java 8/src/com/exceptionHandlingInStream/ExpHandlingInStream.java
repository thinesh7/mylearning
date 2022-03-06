package com.exceptionHandlingInStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExpHandlingInStream {

	public static void main(String[] args) {

		List<String> stringNumbers = Arrays.asList("1", "2", "3", "4", "5");
		
		List<Integer> intNumbers = stringNumbers.stream().map(num -> Integer.parseInt(num))
				.collect(Collectors.toList());
		
		System.out.println(intNumbers);

		// Exception Sinario:

		List<String> stringNumbers1 = Arrays.asList("1", "2", "3", "4", "5");

		List<Integer> intNumbers1 = stringNumbers1.stream().map(num -> Integer.parseInt(num))
				.collect(Collectors.toList());

		System.out.println(intNumbers1);
		
		System.out.println("---");

		// Normal Way:

		List<String> stringNumbers2 = Arrays.asList("1", "2", "3", "4", "5", "xyz");

		// Approach -1
		stringNumbers2.forEach((str) -> {
			try {
				System.out.println(Integer.parseInt(str));
			} catch (NumberFormatException exp) {
				System.out.println("Exp daa..! 1 " + exp.getMessage());
			}
		});

		// Approach - 2;
		stringNumbers2.forEach(str -> printList(str));
		stringNumbers2.forEach(ExpHandlingInStream::printList);

		// Approach - 3:
		stringNumbers2.forEach(handleExceptionIfAny(str -> System.out.println(Integer.parseInt(str)))); // handleExceptionIfAny method 
		// is expecting a consumer and for each give a consumer

	}

	public static void printList(String str) {
		try {
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException exp) {
			System.out.println("Exp daa..! 2 " + exp.getMessage());
		}
	}

	public static Consumer<String> handleExceptionIfAny(Consumer<String> payload) {
		return (obj) -> {
			try {
				payload.accept(obj);
			} catch (Exception exp) {
				System.out.println("Exp daa..! 3 " + exp.getMessage());
			}
		};
	}

}
