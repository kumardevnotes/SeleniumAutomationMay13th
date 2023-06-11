package com.java.methods;

public class JavaStaticMethodsDemo {

	public static void main(String[] args) {
		// ctrl + s --> to save changes in java editor
		// ctrl + shift + f --> to format code in java editor
		System.out.println("Hello People. I am main()");

		// Calling a method
		displayName();
	
		
		//Calling method with string param value
		displayName("Kumar Thoudi");
		
		
		getEmpTaxStatus(1200);
		
		getEmpTaxStatus(800);
		
		getEmpTaxStatus(2500);
		
		getEmpTaxStatus(650);
		
		int empIds[] = {1122, 2233, 3344, 5566, 6677, 445566, 876, 909, 8989, 1001};
		
		for (int i = 0; i < empIds.length; i++) { // 9 ; 9 < 9
			System.out.println("EmpID: " + empIds[i]); //empIds[1]
			
			int finalEmpSal = getfinalSalary( 2000 + i); 
			System.out.println("Emp Salary: " + finalEmpSal);
			
		}
		
		/*int finalEmpSal = getfinalSalary(320);
		System.out.println(finalEmpSal);
		
		finalEmpSal = getfinalSalary(1000);
		System.out.println(finalEmpSal);
		
		finalEmpSal = getfinalSalary(800);
		System.out.println(finalEmpSal);*/
	}

	//Having same method names with different params is called method-overloading in java
	// Declaring a static method in java without parameters
	public static void displayName() {
		System.out.println("John Miller");
	}

	// Declaring a static method in java with String parameter
	public static void displayName(String empName) { // Kumar Thoudi
		System.out.println("Given employee name is: "+empName); // Kumar Thoudi
	}
	
	public static void getEmpTaxStatus(int empSal) { //800
		if(empSal > 1000) { // 800
			System.out.println("Emp has to pay 10% tax");
		}
		else {
			System.out.println("Emp no need to pay the tax");
		}
	}
	
	//Declaring a method with int parameter with int return type
	public static int getfinalSalary(int incentive) { // 2000 + 2500
		int empSalary = 2500;
		int finalSalary = empSalary + incentive; // 2500 + 320 =  2820
		return finalSalary;
	}

}
