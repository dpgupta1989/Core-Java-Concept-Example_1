package com.java.exceptionHandling;

public class Student {
	
	String studentName;
	int studentAge;
	
	public Student(String stuName,int stuAge){
		this.studentName = stuName;
		this.studentAge = stuAge;
	}

	public boolean validateStudentAge() throws InvalidStudentAge{
		
		System.out.println(this.studentName + "-" + this.studentAge);
		
		if(this.studentAge < 18 || this.studentAge > 60){
			throw new InvalidStudentAge("!!!!!!!!!!!!!!!!Student Age is not valid!!!!!!!!!!!!!!!!");
		}
		return true;
	}
}
