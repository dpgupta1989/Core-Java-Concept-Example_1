package com.java.exceptionHandling;

public class MultipleCatchBlockExample_2MainProgram {
	
	public static void main(String[] args) {
		 try{
	         int a[]=new int[7];
	         a[4]=30/0;
//	         a[8]=30/2;  //uncomment this line and comment above line to see the change in exception
	         System.out.println("First print statement in try block");
	     }
		 catch(Exception e){
		        System.out.println("Warning: Some Other exception");
		 }
//			Why we got this error?
//			This is because we placed the generic exception catch block at the first place which means that none of the catch blocks 
//			placed after this block is reachable. You should always place this block at the end of all other specific exception catch blocks.
//		 catch(ArithmeticException e){
//	        System.out.println("Warning: ArithmeticException");
//	     }
//	     catch(ArrayIndexOutOfBoundsException e){
//	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
//	     }
	     
	   System.out.println("Out of try-catch block...");
	}
}
