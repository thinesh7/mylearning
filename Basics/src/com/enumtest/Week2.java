package com.enumtest;

public enum Week2 {

	SUNDAY(1, "Working day"), MONDAY(2, "Working day"), TUESDAY(3, "Working day"), WEDNESDAY(4, "Working day"),
	THURSDAY(5, "Working day"), FRIDAY(6, "Holiday"), SATURDAY(7, "Holiday");

	private int noOfDay;
	private String dayStatus;

	Week2(int noOfDay, String dayStatus) {
		this.noOfDay = noOfDay;
		this.dayStatus = dayStatus;
	}

	public void test() {
		System.out.println("dummy");
	}

	public static void staticTest() {
		System.out.println("static Dummy");
	}
}
