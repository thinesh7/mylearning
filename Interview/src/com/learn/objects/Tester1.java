package com.learn.objects;

public class Tester1 {

	public static void main(String[] args) {
 
		Employee emp1 = new Employee();
		emp1.setFirstName("Thinesh");
		emp1.setLastName("Narayanasamy");

		Employee emp2 = new Employee();
		emp2.setFirstName("Thinesh");
		emp2.setLastName("N");

		System.out.println(emp1 + " " + emp2); // Thinesh Narayanasamy Thinesh N

		// Comparing--> Current Obj Thinesh, Checking with Thinesh true
		System.out.println(emp1.equals(emp2)); // true

		System.out.println(emp1 == emp2); // false

		System.out.println("------------");

		String s1 = new String("55");
		String s2 = new String("55");

		String s3 = "55";
		String s4 = "55";

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s2); // false

		System.out.println(s3.equals(s4)); // true
		System.out.println(s3 == s4); // true
		
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1 == s3); // false
		
		String s5 = new String(s1);
		s5 = new String("66");
		
		System.out.println(s1+" "+s5);

	}
}
