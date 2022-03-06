package com.treeset;

import java.util.TreeSet;

public class MyIntegerTester {

	public static void main(String[] args) {

		TreeSet<MyInteger> myIntSet = new TreeSet<>();

		myIntSet.add(new MyInteger(1));
		myIntSet.add(new MyInteger(3));
		myIntSet.add(new MyInteger(2));
		myIntSet.add(new MyInteger(1));
		myIntSet.add(new MyInteger(100));
		myIntSet.add(new MyInteger(50));
		myIntSet.add(new MyInteger(75));

		System.out.println(myIntSet); // [1, 2, 3, 50, 75, 100] -> Default Sorting Order

		myIntSet = new TreeSet<>((xx, yy) -> {
			Integer x = xx.getIntValue();
			Integer y = yy.getIntValue();
			if (x.equals(y))
				return 0;
			else if (x > y)
				return -1;
			else
				return 1;
		});

		myIntSet.add(new MyInteger(1));
		myIntSet.add(new MyInteger(3));
		myIntSet.add(new MyInteger(2));
		myIntSet.add(new MyInteger(1));
		myIntSet.add(new MyInteger(100));
		myIntSet.add(new MyInteger(50));
		myIntSet.add(new MyInteger(75));

		System.out.println(myIntSet); // [100, 75, 50, 3, 2, 1]
		
		
	}

}
