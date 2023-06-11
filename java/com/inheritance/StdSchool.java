package com.inheritance;

public class StdSchool extends StdClass2 {

	public static void main(String[] args) {

		StdSchool stdSchool = new StdSchool();
		stdSchool.displaySchoolName();
		stdSchool.displaySchoolAnnualIncome();
		stdSchool.displaySchoolAddress();
		
	}

	//Access specifier
	public void displaySchoolName() {
		System.out.println("Little Flower Kids School");
	}

	//Access specifier
	// Private methods can be accessed within same class
	private void displaySchoolAnnualIncome() {
		System.out.println("100000 dollors");
	}
	
	//Access specifier
	protected void displaySchoolAddress() {
		System.out.println("building 1111, hill street 1122333");
	}
	
}
