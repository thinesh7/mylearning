package com.learn;

interface A {
	
	public String dai();
	
	private String ttt() {
		return "25698741256983";
	}
	
	default String t1() {
		return ttt();
	}

	default String aiyo() {
		return "Aiyoo";
	}
	
	static String jhjh() {
		return "5555";
	}

	
	public static void main(String[] a) {
		
	}
}


interface B {
	
	String dai();

	default String aiyo() {
		return "Aiyoo";
	}
}

class Test implements A, B {

	@Override
	public String dai() {
		return "Daaiii..!";
	}

	@Override
	public String aiyo() {
		return A.super.aiyo();
	}
	

}

public class Tester {
	
	public void gasd(String... a) {
		String[] a2 = a;
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.dai());
	}
}
