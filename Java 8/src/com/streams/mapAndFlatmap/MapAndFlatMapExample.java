package com.streams.mapAndFlatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getAllEmp();

		// Convert Employee List of stream to Emp-Emails List of streams -> Data
		// Transform
		List<String> employeeEmails = employees.stream().map(Employee::getEmail).collect(Collectors.toList());
		System.out.println(employeeEmails);
		// 2.
		System.out.println(employees.stream().map((emp) -> emp.getEmail()).collect(Collectors.toList()));
		System.out.println();

		// Flattering Operation:
		// 1. Using Map:
		List<List<Long>> PhoneNumbers = employees.stream().map((emp) -> emp.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println("Map --> " + PhoneNumbers); // Won't Flatten -- > gives list of list of long

		// 2. Using FlatMap:

		List<Long> PhoneNumbersUsingFlatMap = employees.stream().flatMap((emp) -> emp.getPhoneNumbers().stream())
				.collect(Collectors.toList());

		System.out.println("FlatMap --> " + PhoneNumbersUsingFlatMap);
	}

}
