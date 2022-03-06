package com.treeset;

import java.util.TreeSet;

public class TreeSetTester {

	public static void main(String[] args) {

		/*
		 * Underlying DataStructure -> Balanced Tree
		 * 
		 * Null Not Allowed -> throw exp -> java.lang.Comparable.compareTo(Object) No
		 * Insertion order preserved -> Insert and store -> Sorting order Will not allow
		 * Heterogeneous objects to add Class should Implement -> Comparable(I) ->
		 * public int compareTo(T o);
		 * 
		 */

		TreeSet<Integer> treeSet = new TreeSet();

		/*
		 * treeSet.add(null); -> java.lang.NullPointerException: Cannot invoke
		 * "java.lang.Comparable.compareTo(Object)" because "k1" is null
		 */

		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(100);
		treeSet.add(50);
		treeSet.add(75);

		System.out.println(treeSet); // [1, 2, 3, 50, 75, 100] -> Default Sorting Order

		treeSet = new TreeSet<>((x, y) -> {
			if (x.equals(y))
				return 0;
			else if (x > y)
				return -1;
			else
				return 1;
		});

		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(100);
		treeSet.add(50);
		treeSet.add(75);

		System.out.println(treeSet); // [100, 75, 50, 3, 2, 1] -> Customized Sorting Order

		System.out.println(treeSet.first()); // 100
		System.out.println(treeSet.last()); // 1

		treeSet.add(5);
		treeSet.add(0);
		treeSet.add(10);

		System.out.println("--> " + treeSet); // --> [100, 75, 50, 10, 5, 3, 2, 1, 0]
		
		System.out.println(treeSet.headSet(4)); // [100, 75, 50, 10, 5]

		System.out.println(treeSet); // [100, 75, 50, 10, 5, 3, 2, 1, 0]

		System.out.println(treeSet.tailSet(4)); // [3, 2, 1, 0] gives last 4

		System.out.println(treeSet); // [100, 75, 50, 10, 5, 3, 2, 1, 0]

		System.out.println(treeSet.subSet(5, 1)); // [5, 3, 2] --> (from - to)
		
		
		// [100, 75, 50, 10, 5, 3, 2, 1, 0]
		System.out.println(treeSet.lower(9)); // 10 Returns the greatest element in this set 
		// strictly less than the given element, or null if there is no such element.
		
		System.out.println(treeSet.ceiling(60)); // Returns the least element in this set greater than or equal to 
		// the given element, or null if there is no such element.
		
		// Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
		System.out.println("--> "+treeSet.higher(70)); // 50
		treeSet.add(70);
		
		// Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
		System.out.println(treeSet.lower(70)); // 75
		
		System.out.println(treeSet.floor(90)); // 100 -> Returns the greatest element in 
		// this set less than or equal tothe given element, or null if there is no such element
		
		System.out.println(treeSet.descendingIterator().next()); // 0
		System.out.println(treeSet.iterator().next()); // 100
	}

}
