package com.markerInterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTester {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// java.io.NotSerializableException: com.markerInterface.Student

		Student student = new Student();
		student.setName("Thinesh");
		student.setAddrs("UDT");

		File file = new File("G:/A_Java/Z_Java FrameWork/Spring-2022-Practice/practice-3-Interview/Files/test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oops = new ObjectOutputStream(fos);

		oops.writeObject(student);
		oops.close();
		fos.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream oips = new ObjectInputStream(fis);

		Student s = (Student) oips.readObject();
		System.out.println(s.getName() + " " + s.getAddrs());

	}

}
