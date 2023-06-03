package com.io.operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextDocumentDemo {

	public static void main(String[] args) throws IOException {
		//Below code is to get the root folder or project path in the computer
		String rootFolder = System.getProperty("user.dir");
		
		//Below line will locate my TestData.txt file in given path 
		File myFile  = new File(rootFolder+"//src//test//java//com//resources//TestData.txt");
		
		//Below class reads data in Bytes
		BufferedReader brObject = new BufferedReader(new FileReader(myFile));
		
		String myString;
		
		//readLine() reads data line by line
		//When it reaches end of the file, it returns null value
		while((myString = brObject.readLine()) != null) { // null != null --> false
			System.out.println(myString);
		}
	}

}