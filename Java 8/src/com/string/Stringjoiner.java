package com.string;

import java.util.StringJoiner;

public class Stringjoiner {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",","{","}");
		
		System.out.println(sj);
		
		sj.add("one").add("two").add("three");
		
		System.out.println(sj.toString());
		
		String[] stringlist = {"1","2","3","4"};
		
		//String class new method:
		String s = String.join(" ", stringlist);
		System.out.println(s);
	}
}

