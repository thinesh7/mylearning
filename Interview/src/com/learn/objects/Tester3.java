package com.learn.objects;

public class Tester3 {

	public static void main(String[] args) {

		Student s1 = new Student("A", 1);

		s1.setName("B");
		s1.setAge(2);

		System.out.println(s1);
		
		s1 = s1.setName("B");
		s1 = s1.setAge(2);

		System.out.println(s1);
		
		String str1 = "5555";
		
		str1 = "v";
		
		System.out.println(str1);
	}

}
