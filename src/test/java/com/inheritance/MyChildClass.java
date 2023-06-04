package com.inheritance;

public class MyChildClass extends MyParentClass{
	
	static final String empCity = "Newyork";

	public static void main(String[] args) {
		
		/* final keyword
		 * 
		 * if you declare a method in parent class as final, then you can not overide that method in child class
		 *        public final void myMethod()
		 * if you declare a class as final then you can not extend that class in any child class
		 *       public final class MyParentClass {}
		 * if you declare a variable as final, then you can not modify its value
		 *        static final String empCity = "Newyork";
		 * */
		//empCity = "NewJersy";
		System.out.println(empCity);
		
		MyChildClass myChildClassObj = new MyChildClass(); 
		myChildClassObj.displayName();
		myChildClassObj.displayName("John Doe");
		
		System.out.println(myChildClassObj.getEmpAddress());
		
		MyParentClass myParentClassObj = new MyParentClass();
		System.out.println(myParentClassObj.getEmpAddress());
	}
	
	/*Overriding getEmpAddress() in child class.
	 * This method is already available in Parent class
	 * But we are overriding this in Child class
	 * Dynamic polymorphism*/
	public String getEmpAddress() {
		String empAddress = "Mrs Linda. 100, Last street, New Jersy 1000040.";
		return empAddress;
	}
	
	/*Static polymorphism in java
	 * Method overloading in java*/
	
	//Method without param
	public void displayName() {
		System.out.println("John Miller");
	}

	//Method with String Param
	public void displayName(String empName) {
		System.out.println("Given empName is: "+empName);
	}
	
}
