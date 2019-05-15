package com.java.variables;

public class JavaVariablesExample {
	
	int i1=10; 			//instance variable  
	static int i2=20;	//static variable
	
	public void method1(){
		
		System.out.println("Inside JavaVariablesExample - method1");
		int i3=30;		//local variable  
		System.out.println("Printing instancevariable   -- " + i1);
		System.out.println("Printing staticvariable     -- " + i2);
		System.out.println("Printing localvariable      -- " + i3);
		method2();
	}
	
	public void method2(){
		System.out.println("Inside JavaVariablesExample - method2");
		System.out.println("Printing instancevariable   -- " + i1);
		System.out.println("Printing staticvariable     -- " + i2);
//		System.out.println("Printing localvariable      -- " + i3); //uncomemnt this line will throw an error because i3 is a local variable inside method1()
	}
}
