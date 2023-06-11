package com.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionDemo {

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
		 * List collection stores each value/data as an Object. By default List will store any type of data as an Object. Data could be String/int/boolean/char/float
		 * List collection stores duplicate values
		 * List size is dynamic. you can add any num of data values into List
		 * List follows indexing of the values we store
		 * */
		
		List myEmpDetails = new ArrayList();
		
		myEmpDetails.add("John Doe");
		myEmpDetails.add(1122);
		myEmpDetails.add('M');
		myEmpDetails.add(true);
		myEmpDetails.add(3000.45f);
		myEmpDetails.add("John Doe");
		
		System.out.println(myEmpDetails);
		System.out.println(myEmpDetails.get(1)); // 1122
		System.out.println(myEmpDetails.get(5)); 
		
		List myEmpAdditionalDetails = new ArrayList();
		myEmpAdditionalDetails.add("Newyork");
		myEmpAdditionalDetails.add("PostalCode: 32837");
		
		//Adding new collection to existing collection
		myEmpDetails.addAll(myEmpAdditionalDetails);
		
		System.out.println(myEmpDetails);
		
		//Advanced forloop
		for(Object obj : myEmpDetails) {
			System.out.println(obj);
		}
		
		System.out.println(myEmpDetails.contains("James Cameron"));
		
		System.out.println(myEmpDetails.isEmpty());
		System.out.println(myEmpDetails);
		System.out.println(myEmpDetails.remove("John Doe")); //8-1 = 7
		System.out.println(myEmpDetails.size());
	}

}
