package com.mypractice;

public class ReverseWord {

	public static void main(String[] args) {

		// Reverse Word:

		String name = "Thinesh";
		char[] nameCharArrray = name.toCharArray();
		char[] reverseNameCharArrray = new char[nameCharArrray.length];
		int reverseNameCharArrrayIndex = 0;

		for (int i = nameCharArrray.length-1; i >= 0; i--) {
			reverseNameCharArrray[reverseNameCharArrrayIndex] = nameCharArrray[i];
			reverseNameCharArrrayIndex++;
		}

		System.out.println(new String(reverseNameCharArrray)); // hsenihT

	}

}
