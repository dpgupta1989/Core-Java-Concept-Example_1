package com.java.exceptionHandling;

public class FinallyBlockExample_2MainProgram {

	public static void main(String[] args) {
		
//		we have return statement in the method, the finally block still runs.
		
		System.out.println(FinallyBlockExample_2MainProgram.myMethod());  
	   }
	
	   public static int myMethod()
	   {
	      try {
	        return 112;
	      }
	      finally {
	        System.out.println("This is Finally block");
	        System.out.println("Finally block ran even after return statement");
	      }
	  }
}
