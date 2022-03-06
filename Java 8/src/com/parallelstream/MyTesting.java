package com.parallelstream;

import java.util.stream.IntStream;

public class MyTesting {

	public static void main(String[] args) {
		
		IntStream.range(0, 100)
			.parallel()
			.forEach(x-> {
				 System.out.println(Thread.currentThread());
				 System.out.println(x);
			});
	}
}

