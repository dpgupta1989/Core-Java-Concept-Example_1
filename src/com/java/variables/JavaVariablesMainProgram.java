package com.java.variables;

public class JavaVariablesMainProgram {
	
	public static void main(String[] args) {
		
		System.out.println("Inside JavaVariables-MainProgram ");
		JavaVariablesExample obj1 = new JavaVariablesExample();
		
//uncomment below line will throw an error because i3 is not a class or static variable
		System.out.println("Printing instancevariable -- " + obj1.i1);
		System.out.println("Printing staticvariable   -- " + JavaVariablesExample.i2);
//		System.out.println("Printing localvariable -- " + JavaVariablesExample.i3);
		
		obj1.method1();
	}
	
}
