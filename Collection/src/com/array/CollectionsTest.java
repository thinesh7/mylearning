package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {

		List<String> asList = new ArrayList<String>();
		asList.add("1");
		asList.add("2");
		asList.add("2");

		boolean addAll = Collections.addAll(asList, "3", "4");

		System.out.println(addAll); // true

		System.out.println(asList); // [1, 2, 2, 3, 4]

		// Important :-
		List<String> asList2 = Arrays.asList("1", "2");
		System.out.println(asList2); // [1, 2]
 
		// asList2.add("3"); -> Exception in thread "main" java.lang.UnsupportedOperationException
	}

}
