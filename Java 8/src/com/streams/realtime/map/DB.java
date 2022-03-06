package com.streams.realtime.map;

import java.util.ArrayList;
import java.util.List;

public class DB {

	public static List<Employee> getAllEmp() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("AAA", 4_00000));
		empList.add(new Employee("BBB", 4_50000));
		empList.add(new Employee("CCC", 5_00000));
		empList.add(new Employee("DDD", 5_10000));
		empList.add(new Employee("EEE", 7_10000));
		return empList;
	}
}
