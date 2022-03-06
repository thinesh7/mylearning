package com.learn.objects;

/*
 * Immutable Class
 */

final class Student {

	private String name;
	private Integer age;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Student setName(String name) {
		Student student = new Student(name, this.age);
		return student;
	}

	public Integer getAge() {
		return age;
	}

	public Student setAge(Integer age) {
		Student student = new Student(this.name, age);
		return student;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age;
	}

}
