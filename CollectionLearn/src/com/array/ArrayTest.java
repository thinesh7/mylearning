package com.array;

public class ArrayTest {

	public static void main(String[] args) {

		// Setting the array size is important ..! 
		int[] a = new int[10];

		System.out.println(a.length); // 10

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]); // 0000000000
		}
		
		String[] strArray = new String[10];
		
		System.out.println(strArray.length); // 10

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]+" "); //  null null null null null null null null null null
		}

	}

}
