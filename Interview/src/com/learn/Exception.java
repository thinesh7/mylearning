package com.learn;

public class Exception {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hi");
			int i = 5 / 0;
			System.out.println(i);
		} finally {
			System.out.println("Finally");
		}
		System.out.println("..");
	}
	
}
