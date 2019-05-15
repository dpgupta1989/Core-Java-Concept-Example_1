package com.java.exceptionHandling;

public class MultipleCatchBlockExample_1MainProgram {
	
	public static void main(String[] args) {
		 try{
	         int a[]=new int[7];
	         a[4]=30/0;
	         a[8]=30/2;  //uncomment this line and comment above line to see the change in exception
	         System.out.println("First print statement in try block");
	     }
	     catch(Exception e){
	        System.out.println("Warning: ArithmeticException");
	        System.out.println(e);
//	        if(e.equals("java.lang.ArithmeticException")){
//	        	System.out.println("Hi");
//	        }
	     }
//	     catch(ArrayIndexOutOfBoundsException e){
//	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
//	     }
//	     catch(Exception e){
//	        System.out.println("Warning: Some Other exception");
//	     }
	   System.out.println("Out of try-catch block...");
	}
}
