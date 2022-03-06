package com.learn.objects;

public class Tester4 {

	public static void main(String[] args) {

		Integer int1 = new Integer(1);

		Integer int2 = new Integer(1);

		// Integer -> In Equals method they doing value comparison -> value == ((Integer)obj).intValue()

		System.out.println(int1 == int2); // false
		System.out.println(int1.equals(int2)); // true
		System.out.println("Integer-1 " + int1.hashCode() + " Integer-2 " + int2.hashCode()); // Integer-1 1 Integer-2 1

		int2 = 2;

		System.out.println(int1 + " " + int2); // 1 2

		// --------
		System.out.println("--");

		String s1 = new String("str1");
		String s2 = new String("str1");

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println("S-1 " + s1.hashCode() + " S-2 " + s2.hashCode()); // S-1 3541024 S-2 3541024

		// --------
		System.out.println("--");

		Integer i1 = Integer.valueOf(1);
		Integer i2 = Integer.valueOf(1);

		// Integer.valueOf(1); takes object from cache

		System.out.println(i1 == i2); // true
		System.out.println(i2.equals(i2)); // true
		System.out.println("Integer-1 " + i1.hashCode() + " Integer-2 " + i2.hashCode()); // Integer-1 1 Integer-2 1
	}

}
