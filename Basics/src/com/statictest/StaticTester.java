package com.statictest;

public class StaticTester {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Student student = null;

		student.callMeStatic();

		student.callMeInstance(); // Exception in thread "main" java.lang.NullPointerException:
	}

}
