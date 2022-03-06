package com.prgrn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParaCount {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\hp\\Desktop\\TextReader.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		int wordCount = 0;
		int characterCount = 0;
		int paraCount = 0;
		int whiteSpaceCount = 0;
		int sentenceCount = 0;

		while ((line = bufferedReader.readLine()) != null) {
			if (line.equals("")) {
				paraCount += 1;
			} else {
				characterCount += line.length();

				// \s+ is the space delimiter in java
				String words[] = line.split("\\s+");
				wordCount += words.length;

				whiteSpaceCount += wordCount - 1;

				// [!?.:]+ is the sentence delimiter in java
				String sentence[] = line.split("[!?.:]+");
				sentenceCount += sentence.length;
			}
		}

		if (sentenceCount >= 1) {
			paraCount++;
		}

		System.out.println("Total word count = " + wordCount);
		System.out.println("Total number of sentences = " + sentenceCount);
		System.out.println("Total number of characters = " + characterCount);
		System.out.println("Number of paragraphs = " + paraCount);
		System.out.println("Total number of whitespaces = " + whiteSpaceCount);

		bufferedReader.close();
	}

}




//Ref:
	// https://www.geeksforgeeks.org/java-program-to-count-the-number-of-lines-words-characters-and-paragraphs-in-a-text-file/

