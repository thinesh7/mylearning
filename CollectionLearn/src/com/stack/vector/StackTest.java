package com.stack.vector;

import java.util.Enumeration;
import java.util.Stack;

public class StackTest {
	
	// LIFO

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(null);
		
		System.out.println(stack); // [1, 2, 3, null]
		
		stack.push(66);
		
		System.out.println(stack);
		
		System.out.println(stack.pop()); // 66 -> Removes the object at the top of this stack and
		//returns thatobject as the value of this function.
		
		System.out.println(stack); // [1, 2, 3, null]
		
		
		System.out.println(stack.peek()); // null -> [1, 2, 3, null]
		System.out.println(stack); // [1, 2, 3, null]
		
		Enumeration<Integer> elements = stack.elements();
		
		
		
		
	}
}
