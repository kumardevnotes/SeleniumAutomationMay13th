package com.controlstructures;

public class WhileDoWhileDemo {

	public static void main(String[] args) {
		
		System.out.println("while demo");
		int num = 0;
		//in while, we check the condition first. if condition is true, then we will execute while block
		while(num < 0) { // 0 < 0 --> false
			System.out.println(num);
			num++; //5
		}
		
		System.out.println("do while demo");
		//do..while
		//in do..while, we will execute while block first and then check for the condition is true for next iteration
		int num2 = 0;
		do{ 
			System.out.println(num2);
			num2++; //2
		} while(num2 < 0); //5 < 5 --> false
	}

}
