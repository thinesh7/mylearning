package com.polymorphism;

import java.io.IOException;

class parent {

	private void m1() throws Exception {
		System.out.println("1");
	}
	
	private void m1(double d) throws Exception {
		System.out.println("1");
	}

	public void m1(String args) {
		System.out.println("1" + args);
	}

	public String m1(String... a) throws IOException {
		System.out.println(a);
		return a.toString();
	}

	public static void m1(int i) {
		System.out.println(i);
	}

	public static void m1(int i, String a) throws RuntimeException {
		System.out.println(i + a);
	}

}

public class Tester1 {

	public static void main(String[] args) {

		parent.m1(0);
		parent.m1(0, null);
	}
}
