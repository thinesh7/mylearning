package com.test;

import java.util.HashSet;
import java.util.Set;

class Student {

	private String name;
	private String addrs;

	public Student(String name, String addrs) {
		this.name = name;
		this.addrs = addrs;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("I am Hash equals");
		if (obj instanceof Student) {
			return this.name.equals(((Student) obj).name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("I am Hash Code");
		return 123456;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", addrs=" + addrs + "]";
	}
}

public class SetTester {

	public static void main(String[] args) {

		Student student1 = new Student("AAA", "CBE");
		Student student2 = new Student("CCC", "CBE");

		Set<Student> set = new HashSet<>();
		set.add(student1);
		set.add(student2);

		System.out.println(set.size());

		System.out.println(set);

		/*
		 * I am Hash Code 
		 * I am Hash Code 
		 * I am Hash equals 
		 * 2 
		 * [Student [name=AAA, addrs=CBE], Student [name=CCC, addrs=CBE]]
		 */
	}
}
