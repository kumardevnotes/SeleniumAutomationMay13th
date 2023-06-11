package com.collections.demo;


import java.util.HashSet;
import java.util.Set;

public class SetCollectionDemo {

	public static void main(String[] args) {
		
		/*
		 * In java collection, each data is considered as an Object
		 * Collections mainly 2 types. 
		 * List
		 * Set
		 * I would like to store emp details like empName, empId, empGender, empMaritalStatus and empSalary
		 * List - interface and ArrayList is a Class
		 * ArrayList implements List ---> 10 + 5 --> 15
		 * 
		 * Set collection stores each value/data as an Object. By default Set will store any type of data as an Object. Data could be String/int/boolean/char/float
		 * Set collection does not allow duplicate values
		 * Set size is dynamic. you can add any num of data values into Set
		 * Set does not allow/follow indexing of the values we store. so no get(index) method
		 * */
		
		Set myEmpDetails = new HashSet();
		
		myEmpDetails.add("John Doe");
		myEmpDetails.add(1122);
		myEmpDetails.add('M');
		myEmpDetails.add(true);
		myEmpDetails.add(3000.45f);
		myEmpDetails.add("John Doe");
		
		System.out.println(myEmpDetails);
		
		for(Object obj : myEmpDetails) {
			System.out.println(obj);
		}
		
		System.out.println(myEmpDetails.contains("James Cameron"));
		
		System.out.println(myEmpDetails.isEmpty());
		System.out.println(myEmpDetails);
		System.out.println(myEmpDetails.remove("John Doe"));
		System.out.println(myEmpDetails);
		
		myEmpDetails.clear();
		
		System.out.println(myEmpDetails);
		
	}

}
