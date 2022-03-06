package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class HackerTester {

	
	public static void main(String[] args) {
		

		String a = "abcdaqwerttyyuiopokjh";
		String b= "kj*h";
		
		System.out.println("--> "+b.indexOf('*'));
		String substring = b.substring(0, b.indexOf('*'));
		System.out.println(substring);
		
		// https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/solutions-501-550/526-beautiful-arrangement.html
		
		
		
		List<Character> kk =  a.chars().mapToObj(x -> (char)x).collect(Collectors.toList());
		
		kk.forEach(System.out::println);
		
		System.out.println(a.indexOf('k'));
		System.out.println(a.indexOf(b));
		
	}
}
