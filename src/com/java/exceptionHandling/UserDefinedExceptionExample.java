package com.java.exceptionHandling;

public class UserDefinedExceptionExample {

	public static void main(String[] args) throws InvalidStudentAge {
		
		Student obj1 = new Student("Ajay", 2);
		
		try{
		Boolean result = obj1.validateStudentAge();
		System.out.println(result);
		}
		catch(InvalidStudentAge e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally Block Executed");
		}
	}
}
