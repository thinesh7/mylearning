package com.mypractice;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ComparableTester {

	public static void main(String[] args) {

		Arrays.asList(new MyTestComparable(3), new MyTestComparable(2), new MyTestComparable(1)).stream().sorted()
				.forEach(x -> System.out.println(x));

		System.out.println("------");

		TreeSet<MyTestComparable> c = new TreeSet<MyTestComparable>();
		c.add(new MyTestComparable(5));
		c.add(new MyTestComparable(3));
		c.add(new MyTestComparable(1));

		System.out.println(c);

		c = new TreeSet<MyTestComparable>((x, y) -> {
			System.out.println(x + " " + y);
			if (x.getAge() == y.getAge())
				return 0;
			else if (x.getAge() > y.getAge())
				return 1;
			else
				return -1;
		});
		c.add(new MyTestComparable(1));
		c.add(new MyTestComparable(2));
		c.add(new MyTestComparable(3));
		c.add(new MyTestComparable(4));
		c.add(new MyTestComparable(5));

		System.out.println(c);

		System.out.println("---");

		System.out.println(Arrays.asList(1, 2, 3, 4, 5) .stream().sorted((x, y) -> {
			System.out.println(x + " - " + y);
			if (x.intValue() == y.intValue())
				return 0;
			else if (x.intValue() > y.intValue())
				return 1;
			else
				return -1;
		}).collect(Collectors.toList()));

	}

}
