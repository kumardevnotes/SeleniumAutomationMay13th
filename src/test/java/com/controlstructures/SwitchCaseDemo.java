package com.controlstructures;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		// Ctrl + s --> to save the code in a java file
		// Ctrl + Shift + f --> to format the java code you have written in editor
		// java is case sensitive.. that means "SUNDAY" is different from "sunday"

		String day = "Monday";

		switch (day) {
		case "Monday":
			System.out.println("It is Monday and starting day of the week");
			break;
		case "Friday":
			System.out.println("It is Friday and the weekend starts here");
			break;
		case "Saturday":
			System.out.println("It is Saturday and weekend");
			break;
		case "Sunday":
			System.out.println("It is Sunday and its weekend");
			break;
		default:
			System.out.println("Please enter a valid day");
		}

		System.out.println("I am outside switch block");

	}

}
