package com.newpattern;

import java.util.function.Predicate;

public class NewPatternExample {

	public static void main(String[] args) {
		
		Predicate<String> p1 = s -> s.length()<10;
		Predicate<String> p2 = s -> s.length()>3;
		
		System.out.println(p1.and(p2).test("Thineshsdcdscdsc"));
		
		
		
		
	}
}
