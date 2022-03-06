package com.parallelstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataBase {

	public static List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 0; i < 1000; i++) {
			empList.add(new Employee(i, "Employee-" + i, "A", Double.valueOf(new Random().nextInt(1000000))));
		}
		return empList;
	}
}
