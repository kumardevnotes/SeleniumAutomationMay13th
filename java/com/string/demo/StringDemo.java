package com.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		
		String empname  = "John Miller";
		// empname[0] = J
		// empname[1] = o
		// empname[2] = h
		// empname[3] = n
		// empname[4] = _
		// empname[5] = M
		// empname[6] = i
		// empname[7] = l
		// empname[8] = l
		// empname[9] = e
		// empname[10] = r --> length()-1 --> 11-1 = 10
		//Total 11 characters -->  11 - length() of the string
		
		System.out.println(empname);
		
		System.out.println(empname.toLowerCase()); //john miller
		System.out.println(empname.toUpperCase());
		System.out.println(empname.charAt(2)); //h
		System.out.println(empname.replace('l', 'X')); //John MiXXer
		System.out.println(empname.length()); //11
		
		System.out.println(empname.concat(" is a wise man")); //John Miller is a wise man
		System.out.println(empname.equals("john miller")); //false
		System.out.println(empname.equalsIgnoreCase("john miller")); // true
		System.out.println(empname.endsWith("Miller")); //true
		System.out.println(empname.startsWith("Mike")); //false
		
		System.out.println(empname.substring(5)); // "John Miller"
		
		empname  = "  John Miller  ";
		System.out.println(empname);
		System.out.println(empname.trim());
	}

}
