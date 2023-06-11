package com.arrays.demo;

public class ArraysDemo {

	public static void main(String[] args) {
		
		/*int empId2 = 3344;
		System.out.println(empId2);

		empId2 = 4455;
		System.out.println(empId2); */
		
		//Arrays - Arrays store multiple values into a single variable
		//Arrays store same type of data or homogeneous data 
		
		int empIds[] = {1122, 2233, 3344, 5566, 6677, 445566, 876, 909, 8989, 1001};
		
		//Below line will throw error. As array is fixed in size
		//empIds[10]  = 1000;
		
		/*System.out.println( empIds[0]);
		System.out.println( empIds[1]);
		System.out.println( empIds[2]);
		System.out.println( empIds[3]);
		System.out.println( empIds[4]);
		System.out.println( empIds[5]);
		System.out.println( empIds[6]);
		System.out.println( empIds[7]);
		System.out.println( empIds[8]);  // length -1  = 9 -1 = 8
		*/
		
		//classic forloop
		for (int i = 0; i < empIds.length; i++) { // 9 ; 9 < 9
			System.out.println(empIds[i]); //empIds[1]
		}
		
		System.out.println("Printing arrays values in reverse order");
		for (int i = empIds.length -1; i >= 0; i--) { // 7 ; 7 < 9
			System.out.println(empIds[i]); //empIds[7]
		}
		
		String cities[] = {"Hyd", "Dhaka", "Newyork"};
		System.out.println( cities[0]);
		System.out.println( cities[1]);
		System.out.println( cities[2]); //index of last element is length-1 = 3-1 =2
		
		char empGenders[] = {'M', 'F', 'T' , 'M'};
		
		System.out.println( empGenders[0]);
		System.out.println( empGenders[1]);
		System.out.println( empGenders[2]);
	}

}
