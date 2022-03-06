package com.myForLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class School {

	public static final String schoolName = "ABC School";

	private List<Students> studentsList = new ArrayList<>();

	public School(List<Students> studentsList) {
		this.studentsList = studentsList;
	}

	public void forLoop(MyConsumer<Students> students) {
		for (Students s : studentsList) {
			students.accept(s);
		}
	}

	public boolean supplyStudent(Supplier<Students> suplier) {
		Students s1 = suplier.get();
		s1.setName("NEW ??");
		return this.studentsList.add(s1);
	}

}
