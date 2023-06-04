package com.inheritance;

//Inheritance
           //ChildClass extends  ParentClass
           //SubClass extends SuperClass
public class StdClass1 extends StdSchool { // 1 + 2 + 1

	public static void main(String[] args) {
		
		StdClass1 stdObj = new StdClass1(); 
		stdObj.displayStdID();
		stdObj.displaySchoolName();
		//below commented code will not work as the method is private and can not be accessible here
		//stdObj.displaySchoolAnnualIncome();
		stdObj.stdClass2Method();
	}
	
	public void displayStdID() {
		System.out.println("112233");
	}

}
