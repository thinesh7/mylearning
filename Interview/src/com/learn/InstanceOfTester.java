package com.learn;

import com.learn.objects.Employee;

public class InstanceOfTester {

	public static void main(String[] args) throws ClassNotFoundException {

		Employee emp1 = new Employee();

		System.out.println(emp1 instanceof Employee); // true

		System.out.println(emp1 instanceof Object); // true

		// System.out.println(emp1 instanceof String); // Incompatible conditional
		// operand types Employee and String

		System.out.println(Class.forName("com.learn.objects.Employee").isInstance(emp1)); // true

		System.out.println(Class.forName("java.lang.String").isInstance(emp1)); // false
	}

}
