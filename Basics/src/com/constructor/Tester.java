package com.constructor;

class A {
	public A() {
		System.out.println("a");
	}

	public void hh() {
		System.out.println("A :: hh");
	}
}

class B extends A {

	public B() {
		System.out.println("b");
	}

	@Override
	public void hh() {
		System.out.println("B :: hh");
	}
}

class C extends B {

	public C() {
		// super().super(); XXXXX -> Constructor call must be the first statement in a constructor
		super();
		System.out.println("c");
	}

	public void callMe() {
		super.hh();
		hh();
	}

}

public class Tester {

	public static void main(String[] args) {

		C c = new C();
		c.callMe(); // B :: hh

	}
}
