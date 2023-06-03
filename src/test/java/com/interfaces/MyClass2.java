package com.interfaces;

public class MyClass2 implements MyInterface{

	public static void main(String[] args) {
		MyClass2 obj = new MyClass2();
		obj.displayEmpName();
		System.out.println(obj.getEmpSalary());
		obj.printWeekendOrNot("Monday");
	}

	@Override
	public void displayEmpName() {
		System.out.println("John Doe");
	}

	@Override
	public int getEmpSalary() {
		int incentive = 200;
		int fixedSal = 2900;
		int finalSal =  incentive + fixedSal;
		return finalSal;
	}

	@Override
	public void printWeekendOrNot(String day) {
		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
			System.out.println("It is work day");
		}
		else {
			System.out.println("It is weekend");
		}
	}

}
