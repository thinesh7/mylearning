package com.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalGet {

	public static void main(String[] args) {

		Employee emp = new Employee(1, "AAA", null, Arrays.asList(555L, 999L));

		Optional<String> NameOpt = Optional.ofNullable(emp.getName());
		System.out.println(NameOpt); // --> Optional[AAA]
		System.out.println(NameOpt.get()); // --> AAA

		Optional<String> emailOpt = Optional.ofNullable(emp.getEmail());
		System.out.println(emailOpt); // -- > Optional.empty
		// System.out.println(emailOpt.get()); ---> java.util.NoSuchElementException: No

		// So to avoid Exception check the value if it is present
		if (emailOpt.isPresent()) // return false
			System.out.println(emailOpt.get()); // Won't execute

	}
}

