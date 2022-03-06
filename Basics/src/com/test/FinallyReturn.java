package com.test;

public class FinallyReturn {

	public static void main(String[] args) {
		System.out.println(hello(-1));
	}

	private static int hello(int v) {
		try {
			if (v > 0) {
				System.out.println("In1");
				return v;
			}
			System.out.println("In2");
			return 0;
		} finally {
			System.out.println("Done..!");
		}
	}
}

/*
 * In2 Done..! 0
 * 
 */