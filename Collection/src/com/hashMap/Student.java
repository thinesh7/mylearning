package com.hashMap;

public class Student {

	private String name;

	public Student() {
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			boolean flag = this.name.equals(((Student) obj).name);
			System.out.println(
					"Current Name : " + name + " Comparring Object Name : " + ((Student) obj).name + " --> " + flag);
			return flag;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
