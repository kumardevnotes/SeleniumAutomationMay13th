package com.interfaces;

public class MyClass1 implements MyInterface{

	public static void main(String[] args) { //3 interface methods + 1 method at class level --->  4methods
		MyClass1 obj = new MyClass1();
		obj.displayEmpName();
		System.out.println(obj.getEmpSalary());
		obj.printWeekendOrNot("Saturday");
		obj.displayMessage();
	}

	@Override
	public void displayEmpName() {
		System.out.println("John Miller");
	}

	@Override
	public int getEmpSalary() {
		return 2500;
	}

	@Override
	public void printWeekendOrNot(String day) {
		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
			System.out.println("It is not weekend. It is work day");
		}
		else {
			System.out.println("It is weekoff");
		}
		
	}
	
	public void displayMessage() {
		System.out.println("Hello All!");
	}
	
	

}
