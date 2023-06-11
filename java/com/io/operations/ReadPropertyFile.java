package com.io.operations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	//File IO means File input and Output operations

	public static void main(String[] args) throws IOException  {
	 
		//this will give root folder or main project folder path in your PC
		String rootFolder = System.getProperty("user.dir"); 
		//rootFolder == C:\Users\DELL\Documents\May13th Data\Repos\SeleniumAutomationMay13th
	 
		//Load the file into myFile object using FileReader class of java
	  FileReader myFile = new FileReader(rootFolder + "//src//test//java//com//resources//appData.properties");
	  
	  //Creating a properties object to load the file data
	  Properties props  = new Properties();
	  //Loading properties file into props object
	  props.load(myFile);
	  
	  System.out.println(props.getProperty("appBrowser"));
	  System.out.println(props.getProperty("appUrl"));
	  System.out.println(props.getProperty("appUserEmailID"));
	  System.out.println(props.getProperty("apppassword"));
	  System.out.println(props.getProperty("appUserName"));
	  

	}

}