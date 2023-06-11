package com.excpetion.handling;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int num1 = 100;
			int num2 = 10;
			System.out.println(num1 / num2);

			String empName = "john";
			System.out.println(empName.toUpperCase());

		} catch (ArithmeticException e) {
			System.out.println("Caught an exception:" + e);
		} catch (NullPointerException e) {
			System.out.println("Caught an exception:" + e);
		}
		
		//Optional block
		finally {
			//closing the files
			// close db object
			//remove unwanted files
			System.out.println("I will run always");
		}

		System.out.println("All operations completed");

	}

}
