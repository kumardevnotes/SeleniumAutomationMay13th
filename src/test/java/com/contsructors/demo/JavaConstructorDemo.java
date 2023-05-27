package com.contsructors.demo;

public class JavaConstructorDemo {
	
	
	//Below is a default constructor in java. Constructor name should be same as className
	JavaConstructorDemo(){ 
		System.out.println("I am default constructor");
	}
	
	
	//below is a  String Parameterized constructor
	JavaConstructorDemo(String message){ 
		System.out.println("I am parameterized constructor with some message "+ message);
	}
	
	public static void main(String[] args) {
		JavaConstructorDemo myObj = new JavaConstructorDemo();
		
		myObj.displayName();
		myObj.displayName("Kumar"); 
		
		JavaConstructorDemo myObj2 = new JavaConstructorDemo("hello All!");
	}
	
	//non-static method
	public void displayName() {
		System.out.println("John Miller");
	}

	// Declaring a non-static method in java with String parameter
	public void displayName(String empName) { // Kumar Thoudi
		System.out.println("Given employee name is: "+empName); // Kumar Thoudi
	}

}
