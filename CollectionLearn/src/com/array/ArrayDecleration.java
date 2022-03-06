package com.array;

public class ArrayDecleration {

	public static void main(String[] args) {

		// Way 1:
		int[] i = { 1, 2, 3, 4, 5 };

		System.out.println(i[4]); // 5

		// way 2:

		int[] i1 = new int[5];

		i1[0]  = 1;
		i1[i1.length - 1] = 5;

		System.out.println(i1); // [I@2d363fb3
	}

}
