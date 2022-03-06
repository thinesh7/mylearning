package com.learn.constructor;

class A {

	private String a;

	public A() {
		// this("a"); Recursive constructor invocation A(String)
		// this("");
		// this(5); Constructor call must be the first statement in a constructor
	}

	public A(String a) {
		this(10);
	}

	public A(Integer a) {
		this();
	}
}

public class ConstructorTest {

}
