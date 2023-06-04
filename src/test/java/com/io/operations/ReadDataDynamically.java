package com.io.operations;

import java.util.Scanner;

public class ReadDataDynamically {

	public static void main(String[] args) {
		
		//Assignment for next week -  June 10 & 11 - with double and int arrays as shown below
		
		double empSalries [] =  new double [5];
		
		for (int i = 0; i < empSalries.length; i++) {
			System.out.println("Please enter empSal");
			Scanner scan = new Scanner(System.in);
			empSalries[i] = scan.nextDouble(); //400.505050505
		}
		
		 for (int i = 0; i < empSalries.length; i++) {
			 System.out.println(empSalries[i]);
		}
		
		// int empIds[] = {1122, 2233, 3344, 5566, 6677, 445566, 876, 909, 8989, 1001};
		
		// Declaring array with size
		int newEmpIds[] = new int[5];
		//Trying to store values into array
		
		/* newEmpIds[0] = 101;
		 newEmpIds[1] = 102;
		 newEmpIds[2] = 103;
		 newEmpIds[3] = 110;
		 newEmpIds[4] = 201; */
		
		for (int i = 0; i < newEmpIds.length; i++) {
			System.out.println("Please enter empId");
			Scanner scan = new Scanner(System.in);
			newEmpIds[i] = scan.nextInt();
		}
		 
		System.out.println("Printing empIds");
		
		 //trying to print the values in array
		 for (int i = 0; i < newEmpIds.length; i++) {
			 System.out.println(newEmpIds[i]);
		}
		
	}

}
