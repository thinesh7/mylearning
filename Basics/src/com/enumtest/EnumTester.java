package com.enumtest;

public class EnumTester {

	public static void main(String[] args) {

		Week2 monday = Week2.MONDAY;

		monday.test();
		Week2.staticTest();

		System.out.println(monday);

		System.out.println("---");

		Week3 tuesday = Week3.TUESDAY;

		tuesday.test();
		tuesday.staticTest();

		System.out.println(tuesday);
	}

}
