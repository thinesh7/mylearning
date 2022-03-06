package com.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;

		start = System.currentTimeMillis();
		IntStream.range(0, 50).forEach((i) -> System.out.println(i));
		end = System.currentTimeMillis();

		System.out.println("Time Taken --> " + (end - start) + " Milli Second"); // Time Taken --> 30 Milli Second

		start = System.currentTimeMillis();
		IntStream.range(0, 50).parallel().forEach((i) -> System.out.println(i));
		end = System.currentTimeMillis();

		System.out.println("Time Taken --> " + (end - start) + " Milli Second"); // Time Taken --> 18 Milli Second

		System.out.println("------");

		// Thread:

		IntStream.range(1, 51).forEach((i) -> {
			System.out.println("Thread -> " + Thread.currentThread() + " " + i);
		});
		System.out.println();
		IntStream.range(1, 51).parallel().forEach((i) -> {
			System.out.println("Thread -> " + Thread.currentThread() + " " + i);
		});

	}

}
