package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBehaviour {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		/*  1.2v
		 * Underline data structure is -> Resizable Array or growable Array
		 * Duplicates Allowed
		 * Null Allowed
		 * Insertion Order preserved
		 * Heterogeneous objects allowed
		 * All methods in AL are not synchronized,  not thread safe,
		 * high performance ->  vector opposite
		 * 
		 * Default Size : 10
		 * if 11th element added -> [ (current capacity * (3/2)) +1 ]
		 * 
		 * 10 => 16 => 25
		 * 
		 * Implements -> RandomAccess(I) -> Marker Interface
		 * For frequent retrieval operation
		 * 1st element -> same speed
		 * 100th element also -> same speed
		 * 
		 * AL -> Best in frequent Retrieval ..! But Worst in frequent Insertion and 
		 * Deletion in middle of AL..!
		 */
		
		
		List<Integer> intList = new ArrayList<>(); // with default capacity of => 10
		
		intList = new ArrayList<>(25); // This will creates the ArrayList size with default capacity of 25
		
		intList = new ArrayList<>(Arrays.asList(1, 2 ,3));
		
		// How to make AL Thread Safe:
		List<Integer> synchronizedList = Collections.synchronizedList(intList);
		System.out.println(synchronizedList);
		
		intList.sort((x,y) -> 0);
		
	}
}
