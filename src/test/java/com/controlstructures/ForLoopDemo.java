package com.controlstructures;

public class ForLoopDemo {

	public static void main(String[] args) {
		// forloop is a control structure where you can execute same statement
		// repeatedly base don some condition

		// forloop in forward direction
		// declaration; condition; increment/decrement
		System.out.println("Below output is from 1st for loop");
		for (int i = 0; i < 5; i++) { // 5 ; 5 < 5 --> FALSE
			System.out.println("I am happy with iteration " + i); // 1
		}

		System.out.println("I am outside for loop");

		System.out.println("Below output is from 2nd for loop");
		// forloop in backward direction
		for (int i = 5; i >= 0; i--) { // -1 ; -1 >=0
			System.out.println("I am happy with iteration " + i);
		}

		System.out.println("Below output is from 3rd for loop");
		//break will terminate for loop based on some condition
		for (int i = 0; i < 5; i++) {
			if (i == 2) { // 2 == 2 --> true
				break;
			}
			System.out.println("I am happy with iteration " + i); // 1
		}

		System.out.println("Below output is from 4th for loop");
		//continue will skip that particular iteration and execute remaining iterations
		for (int i = 0; i < 5; i++) {
			if (i == 2) { // 2 == 2 --> true
				continue;
			}
			System.out.println("I am happy with iteration " + i); // 1
		}
	}

}
