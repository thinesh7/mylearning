package com.polymorphism;

import java.io.IOException;

class A {

	public static void m1() {

	}

	public void m2() throws IOException {

	}

	public void m3() throws IOException {

	}

}

class B extends A {

	public static void m1() {
	}

	@Override
	public void m2() throws IOException {
		System.out.println("<....>");
	}

	public void m2(int a) throws IOException {
		System.out.println("<....>");
	}

	public void m2(String a) {
		System.out.println("<....>");
	}

	/* @Override
	public void m3() throws Exception { ->  Exception Exception is not compatible with throws clause in A.m3(
		System.out.println("");
	} */

}

public class Tester2 {

	public static void main(String[] args) {

		
	}
}
