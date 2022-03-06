package com.enumtest;

public class Week3 {

	public static final Week3 MONDAY = new Week3(1, "Working day", "MONDAY");
	public static final Week3 TUESDAY = new Week3(1, "Working day", "TUESDAY");
	public static final Week3 WEDNESDAY = new Week3(1, "Working day", "WEDNESDAY");
	public static final Week3 THURSDAY = new Week3(1, "Working day", "THURSDAY");
	public static final Week3 FRIDAY = new Week3(1, "Working day", "FRIDAY");

	private int noOfDay;
	private String dayStatus;
	private String name;

	private Week3(int noOfDay, String dayStatus, String name) {
		this.noOfDay = noOfDay;
		this.dayStatus = dayStatus;
		this.name = name;
	}

	public void test() {
		System.out.println("dummy");
	}

	public static void staticTest() {
		System.out.println("static Dummy");
	}

	public int getNoOfDay() {
		return noOfDay;
	}

	public String getDayStatus() {
		return dayStatus;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
