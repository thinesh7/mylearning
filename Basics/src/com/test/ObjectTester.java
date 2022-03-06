package com.test;

public class ObjectTester {

	private static int count;

	public ObjectTester() {
		count++;
	}
	
	@Override
	public String toString() {
		return "ObjectTester "+count;
	}
	
	public static void main(String[] args) {
		
		System.out.println(new ObjectTester());
		System.out.println(new ObjectTester());
		System.out.println(new ObjectTester());
		
		
		System.out.println(count);
		
	}

}
