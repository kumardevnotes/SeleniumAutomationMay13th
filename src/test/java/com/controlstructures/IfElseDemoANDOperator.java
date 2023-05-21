package com.controlstructures;

//demo on if..else control structure
public class IfElseDemoANDOperator {

	public static void main(String[] args) {

		int personAge = 15; // using assignment operator in java , Assigning a value to int variable

		// AND - && operator
		/*  true && true --> true
		 *   true && false --> false
		 *   false && true --> false
		 *   false && false --> false
		 * */
		if (personAge >= 18 && personAge <= 60) { // 15 >= 18 && 15 <=60 --> false && true --> false
			System.out.println("Person can go to voting booth and vote");
		} else if (personAge >= 18 && personAge > 60) { // 15 >= 18 && 15 > 60 --> false && false --> false
			System.out.println("person can vote from his home...");
		}

		else {
			System.out.println("Person can not vote");
		}
	}

}
