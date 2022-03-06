package com.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalObjectCreationExample {

	public static void main(String[] args) {

		// Create Optional Object:

		// 1. Using empty --> creates empty Optional Object:
		Optional<Object> emptyOpt = Optional.empty();
		System.out.println(emptyOpt); // ---? o/p --> Optional.empty

		// 2. Using of() --> Should have a value else throw java.lang.NullPointerException

		Employee emp = new Employee(1, "AAA", null, Arrays.asList(555L, 999L));
		// Optional<String> emailOpt = Optional.of(emp.getEmail()); --> java.lang.NullPointerException

		// 3. Using ofNullable():
		Optional<String> emailOpt = Optional.ofNullable(emp.getEmail());
		System.out.println(emailOpt);
		
	}
}
