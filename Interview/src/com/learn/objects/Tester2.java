package com.learn.objects;

public class Tester2 {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setFirstName("Thinesh");
		emp1.setLastName("Narayanasamy");

		Employee emp2 = new Employee();
		emp2.setFirstName("Thinesh");
		emp2.setLastName("N");

		System.out.println(emp1 + " " + emp2); // Thinesh Narayanasamy Thinesh N

		Employee emp3 = emp1;
		emp3.setFirstName("AAAAA");

		System.out.println(emp1 + " " + emp2 + " " + emp3); // AAAAA Narayanasamy Thinesh N AAAAA Narayanasamy

		Employee emp4 = emp1;
		emp4.setFirstName("--");
		emp4.setLastName("--");

		System.out.println(emp1 + " " + emp3 + " " + emp4); // -- -- -- -- -- --

		// String is Immutable --

		String s1 = new String("5555");

		String s3 = "";
		s3 = s1;

		String s4 = "5555";

		System.out.println(s1 == s3); // true
		System.out.println(s1.equals(s3)); // true

		System.out.println(s1 == s4); // false
		System.out.println(s1.equals(s4)); // true

		s3 = "5698745896";

		System.out.println(s1 + " " + s3);

		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // false

	}

}
