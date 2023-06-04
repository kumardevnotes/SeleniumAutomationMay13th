package com.io.operations;

import java.io.File;
import java.io.IOException;

public class CreateFoldersAndFilesDynamically {
	
	//Assignment for next week -  June 10 & 11-  Create new folders and create files inside your own package

	public static void main(String[] args) throws IOException {
		String rootFolder = System.getProperty("user.dir"); 
		
		//To create new folder, delete and again create it
		File myFolder = new File (rootFolder+ "//src//test//java//JBTraining");
		if(myFolder.mkdir()) {
			System.out.println("New folder created");
		}
		else
		{
			System.out.println("Folder already exists. So deleting it");
			myFolder.delete();
			myFolder.mkdir();
			System.out.println("New folder created, post deletion");
		}
		
		File myFile = new File (rootFolder+ "//src//test//java//JBTraining//Testdata.txt");
		if(myFile.createNewFile()) {
			System.out.println("New file created");
		}
		else
		{
			System.out.println("File already exists");
		}
	}

}
