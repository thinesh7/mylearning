package com.list.set.queue;

import java.util.ArrayList;
import java.util.List;

public class ListBehaviour {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();

		intList.add(null); // Null Allowed
		intList.add(1); // Duplicates allowed
		intList.add(1);
		intList.add(55); // Insertion order preserved

		System.out.println(intList); // [null, 1, 1, 55]
		
		
		
		
		
		
		
		
		
		
		
		

		Integer i1 = 1;
		Integer i2 = 1;

		System.out.println(i1 == i2); // true

	}
}
