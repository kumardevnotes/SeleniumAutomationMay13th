package com.controlstructures;

public class IfElseDemoOROperator {

	public static void main(String[] args) {
		int inDebitCard1 = 90;
		int inDebitCard2 = 70;
		/* OR Operator
		 *  true || true --> true
		 *  true || false --> true
		 *  false || true --> true
		 *  false || false --> false
		 * */
		if(inDebitCard1 >=100 || inDebitCard2 >=100) { // 90 >= 100 || 70 >=100 --> false || false --> false 
			System.out.println("I can go to a movie");
		}
		else {
			System.out.println("I need to borrow money to go to a movie");
		}
	}

}
