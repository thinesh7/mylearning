package com.mypractice;

public class MyTestComparable implements Comparable<MyTestComparable> {

	private Integer age;

	public MyTestComparable(Integer age) {
		super();
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public int compareTo(MyTestComparable obj) {
		if (age == obj.age) {
			return 0;
		} else if (age > obj.age) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return age.toString();
	}
}
