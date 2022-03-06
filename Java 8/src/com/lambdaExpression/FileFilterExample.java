package com.lambdaExpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterExample {

	public static void main(String[] args) {
		
		//Lambda Expression: Easy to write and has good readability
		FileFilter fileFilterLambda = (File pathName) -> pathName.getName().endsWith(".java");
		
		File fileDirectory = new File("G:/A_MyCTS_Learning/Java 8/LambdaExpression/Testing");
		
		File[] files = fileDirectory.listFiles(fileFilterLambda);
		
		for(File file: files) {
			System.out.println(file.getName());
		}
	}
}
