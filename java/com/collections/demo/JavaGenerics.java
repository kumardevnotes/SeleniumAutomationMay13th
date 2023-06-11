package com.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

	public static void main(String[] args) {
		/*
		 * List stores all different types of data as Objects ex: int, String, float,
		 * char, boolean, by default. I want to restrict my List collection to store
		 * only specific data ... Such as only int or only String but not both
		 * Generics in collection
		 */

		List<String> myCities = new ArrayList<String>();
		myCities.add("Newyork"); //0
		myCities.add("Dhaka"); //1
		myCities.add("newJersy"); //2
		myCities.add(1, "NewDelhi");
		System.out.println(myCities);
		//myCities.add(12222);

		// List myEmpDetails = new ArrayList();
		
		List<Integer> empIds = new ArrayList<Integer>();
		empIds.add(1122);
		empIds.add(5566);
		System.out.println(empIds);

	}
}