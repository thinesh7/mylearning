package com.test;

class MyContextTester {

	private String a = m1();

	private String m1() {
		System.out.println("a - m1()");
		return "a";
	}

	public MyContextTester() {
		System.out.println("Constructor");
	}

	{
		System.out.println("Instance Block");
	}

	private static String b = m2();

	private static String m2() {
		System.out.println("b - static - m1()");
		return "b";
	}
	
	static {
		System.out.println("Static Block");
	}

}

public class ContextTester {

	public static void main(String[] args) {
		
		System.out.println(new MyContextTester());
		
	}
	
	/*
	 *  b - static - m1()
		Static Block
		a - m1()
		Instance Block
		Constructor
		com.test.MyContextTester@7d6f77cc
	 */
	
}
