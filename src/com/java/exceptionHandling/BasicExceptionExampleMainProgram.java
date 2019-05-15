package com.java.exceptionHandling;

public class BasicExceptionExampleMainProgram {
	
	public static void main(String[] args) {

		 int number1, number2;
		 
	      try {
	    	  
	         number1 = 0;
	         number2 = 62 / number1;
	         System.out.println(number2);
	         System.out.println("Hey I'm at the end of try block");
	         
	      }
	      catch (ArithmeticException e) { 
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e) {
	         System.out.println("Exception occurred");
	      }
	      System.out.println("I'm out of try-catch block in Java.");
	   }
}
