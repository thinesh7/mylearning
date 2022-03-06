package com.FunctionalInterface;

@FunctionalInterface
interface MyFunctionalInterface{
	
	void something();
	
	// Object methods
	boolean equals(Object obj); // Allowed - Object class Method
	String toString(); // Allows - Object class Method
	int hashCode();
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		MyFunctionalInterface testing = () -> {
			System.out.println("Hi");
		};
		
		testing.something();
		
		MyFunctionalInterface testMe = () -> {
			System.out.print("I am doing nothing");
		};
		
		testMe.something();
		
	}
	
	
}
