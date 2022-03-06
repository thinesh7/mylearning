package com.hashtable;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 123456789;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
