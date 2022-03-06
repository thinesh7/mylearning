package com.forName.instancOf.newInstance;

public class Student {

	static {
		System.out.println("Student Class bytecode loading");
	}

	public Student() {
		System.out.println("Student Class Obj Creation");
	}
}
