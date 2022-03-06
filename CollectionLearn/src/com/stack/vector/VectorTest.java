package com.stack.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		// Legacy Class:
		
		Vector<Integer> vector = new Vector<Integer>();
		
		System.out.println(vector.capacity()); // 10 ->  Default Capacity
		
		vector = new Vector<Integer>(100);
		System.out.println(vector.capacity()); // 100 
		
		
	}
	
}
