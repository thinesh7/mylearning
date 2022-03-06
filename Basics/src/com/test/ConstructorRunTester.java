package com.test;

class A {

	public A() {
		System.out.println("A");
	}

}

class B extends A {

	public B() {
		System.out.println("B");
	}

}

class C extends B {

	public C() {
		System.out.println("C");
	}

}

public class ConstructorRunTester {
	
	public static void main(String[] args) {
		
		
		System.out.println(new C());
		
	}
	
}
