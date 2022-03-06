package com.code;

import java.io.IOException;

class A {
	
	public final void h1() {
		
	}
	
	public void m1() throws IOException {

	}
}

class B extends A{

	@Override
	public void m1() throws IOException { // Exception Exception is not compatible with throws clause in A.m1()
		super.m1();
	}
}

public class TesterClass {

	public static void main(String[] args) {
		new B().h1();
	}
	
	
}
