package com.string;

import java.util.stream.IntStream;

public class StringExample {

	
	public static void main(String[] args) {
		
		String  s = "Hello";
		
		IntStream stream = s.chars();
		
		stream.mapToObj(letter -> (char)letter)
			  .map(Character::toUpperCase)
			  .forEach(System.out::println);
			  
	}
	
}
