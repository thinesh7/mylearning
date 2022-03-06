package com.optional;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalMethods {

	public static void main(String[] args) {

		Employee emp = new Employee(1, "aaaaTTaaaa", null, Arrays.asList(555L, 999L));

		Optional<String> emailOpt = Optional.ofNullable(emp.getEmail());

		// 1. Using orElse Method:
		System.out.println(emailOpt.orElse("Null da daii --> default@gmail.com"));

		String name = Optional.ofNullable(emp.getName()).orElse("Null da daii --> AAA");
		System.out.println(name);

		// 2 . Using orElseGet Method: This will use a Supplier
		Supplier<String> supplier = () -> "From supplier Null da daii --> default@gmail.com";
		System.out.println(emailOpt.orElseGet(supplier));

		// 3 .Using orElseThrow Method:

		// System.out.println(emailOpt.orElseThrow()); java.util.NoSuchElementException: No value present
		// System.out.println(emailOpt.orElseThrow(() -> new IllegalArgumentException("Value is Null daa..!")));

		// 4 .Using Map Method:
		String resMap = emailOpt.map((val) -> val.toUpperCase()).orElse("ONUMA ILLA..!");
		System.out.println(resMap);
		System.out.println(Optional.ofNullable(emp.getName()).map(String::toUpperCase).orElse("ONUMA ILLA..!"));
	}
}
