package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOExample {
	
	static Path path = Paths.get("G:", "Testing");

	public static void main(String[] args) {
		
		try(Stream<Path> stream = Files.walk(path)){
			
			stream.filter( path-> path.toFile().isDirectory())
				  .forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
