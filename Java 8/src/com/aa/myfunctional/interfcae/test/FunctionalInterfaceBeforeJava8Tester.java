package com.aa.myfunctional.interfcae.test;

/*
 * Before Java 8:
 */

interface IamTester {
	String callMe(String str);
}

class IamTesterImpl implements IamTester {

	@Override
	public String callMe(String name) {
		return name + " Hello..!";
	}

}

class A {

	public String hello(IamTester a, String name) {
		return a.callMe(name);
	}
}

public class FunctionalInterfaceBeforeJava8Tester {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.hello(new IamTesterImpl(), "Thinesh"));

	}
}
