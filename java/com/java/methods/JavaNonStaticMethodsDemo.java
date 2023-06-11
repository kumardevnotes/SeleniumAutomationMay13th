package com.java.methods;

public class JavaNonStaticMethodsDemo {

	public static void main(String[] args) {
		//Calling non-static method in main() it will throw error
		//displayName();
		
		//A standard expression to create an object of java class
		JavaNonStaticMethodsDemo myObj = new JavaNonStaticMethodsDemo();
		
		//Calling non-static method using class object
		myObj.displayName();
		
		myObj.displayName("Mike Miller");
		
		myObj.getEmpTaxStatus(35000);
		
		int myFinalSal  = myObj.getfinalSalary(350);
		
		System.out.println(myFinalSal);
	}

	//Having same method names with different params is called method-overloading in java
	// Declaring a non-static method in java without parameters
	public void displayName() {
		System.out.println("John Miller");
	}

	// Declaring a non-static method in java with String parameter
	public void displayName(String empName) { // Kumar Thoudi
		System.out.println("Given employee name is: "+empName); // Kumar Thoudi
	}
	
	//non-static method
	public void getEmpTaxStatus(int empSal) { //3500
		if(empSal > 1000) { // 3500
			System.out.println("Emp has to pay 10% tax");
		}
		else {
			System.out.println("Emp no need to pay the tax");
		}
	}
	
	//Declaring a non-static method with int parameter with int return type
	public int getfinalSalary(int incentive) { // 2000 + 2500
		int empSalary = 2500;
		int finalSalary = empSalary + incentive; // 2500 + 320 =  2820
		return finalSalary;
	}

}
