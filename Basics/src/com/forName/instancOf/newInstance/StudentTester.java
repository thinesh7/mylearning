package com.forName.instancOf.newInstance;

class A {

}

class B extends A {

}

public class StudentTester {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// Student class byte code will be loaded into JVM memory
		Class forName = Class.forName("com.forName.instancOf.newInstance.Student");
		// Student Class bytecode loading

		// Dont know type at beginning -> Type avalilable at trun time
		System.out.println(forName.isInstance(new Integer(1))); // false

		Student student = (Student) forName.newInstance(); // non private and o-arg constructor is expected in Student
															// class
		// Student Class Obj Creation

		System.out.println(student instanceof Student); // true

		// if No 0-arg constructor available in studnet class-> InstantiationException

		// if non private constructor available in studnet class->
		// IllegalAccessException

		
		// System.out.println(new A() instanceof String); => Incompatible conditional operand types A and String
		System.out.println(new A() instanceof B); // false
		System.out.println(new B() instanceof B); // true
		System.out.println(new B() instanceof A); // true
		Object a = new B();
		System.out.println(a instanceof A); // true

	}

}
