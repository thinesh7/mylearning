package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	private String name;
	private String id;

	public Test(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String args[]) {

		Test e1 = new Test("ABC", "3");

		Test e2 = new Test("XYZ", "1");

		Test e3 = new Test("DEF", "2");

		Test e4 = new Test("PQR", "5");

		Test e5 = new Test("JKL", "4");
		
		Test e6 = new Test("ABC", "0");

		List<Test> list = new ArrayList<Test>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		// list.sort((x, y) -> x.id.compareTo(y.id));
		
		list.sort((x,y) -> Integer.valueOf(x.id) - Integer.valueOf(y.id));

		for (Test e : list) {
			System.out.println("Id: " + e.id + " Name: " + e.name);
		}
	}

}