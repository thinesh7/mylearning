package com.myForLoop;

import java.util.ArrayList;
import java.util.Arrays;


public class SchoolTester {

	public static void main(String[] args) {

		Students s1 = new Students("AAA", 5, "CBE");
		Students s2 = new Students("BBB", 6, "CBE");
		Students s3 = new Students("CCC", 7, "CBE");
		Students s4 = new Students("DDD", 8, "CBE");

		School school = new School(new ArrayList<>(Arrays.asList(s1, s2, s3, s4)));

		school.forLoop(new MyConsumer<Students>() {
			@Override
			public void accept(Students s) {
				System.out.println(s);
			}
		});

		school.forLoop(x -> System.out.println(x.getName() + "  " + x.getStandard() + "   " + x.getAddrs()));
		System.out.println(school.supplyStudent(()-> s1));
		school.forLoop(x -> System.out.println(x.getName() + "  " + x.getStandard() + "   " + x.getAddrs()));
	}

}
