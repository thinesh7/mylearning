package com.parallelstream;

import java.util.List;

public class EmployeeTester {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();

		// To get Paralle Stream --> employees.parallelStream(); employees.stream().parallel();

		long start = 0;
		long end = 0;

		start = System.currentTimeMillis();
		System.out.println(employees.stream().mapToDouble(emp -> emp.getSalary()).average().getAsDouble());
		end = System.currentTimeMillis();

		System.out.println("Time Taken --> " + (end - start) + " Milli Second");

		start = System.currentTimeMillis();
		System.out.println(employees.parallelStream().mapToDouble(emp -> emp.getSalary()).average().getAsDouble());
		end = System.currentTimeMillis();

		System.out.println("Time Taken --> " + (end - start) + " Milli Second");
	}
}
