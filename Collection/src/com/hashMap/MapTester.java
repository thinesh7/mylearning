package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MapTester {

	public static void main(String[] args) {

		Map<Student, String> mapList = new HashMap<>();

		Student s1 = new Student("AAA");
		System.out.println(s1.hashCode()); // 2104457164

		Student s2 = new Student("AAA");
		System.out.println(s2.hashCode()); // 1521118594

		Student s3 = new Student("AAA");
		System.out.println(s3.hashCode());

		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s3)); // true

		// Both are Equal and but diff hashcode

		mapList.put(s1, "one");
		mapList.put(s2, "two");
		mapList.put(s3, "three");

		System.out.println(mapList); // {AAA=one, AAA=three, AAA=two}

		// 1st this is seeing hashcode and then only it is seeing equals ..!

	}

}
