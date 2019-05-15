package com.java.collection.hashSet;

public class Student implements Comparable<Student> {
	
	private String studentname;
    private int rollno;
    private int studentage;
    
//    Parameterized Constructor
    public Student(int rollno, String studentname, int studentage){
    	this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public Student(){
    	
    }
    @Override
	public int compareTo(Student compareStudentAge) {
    	
    	if(this.studentage < compareStudentAge.studentage){
    		return -1;
    	}
    	if(this.studentage == compareStudentAge.studentage){
    		return 0;
    	}
    	return 1;
    	}
    
    @Override
    public String toString() {
    	System.out.println("@@@@ToString method called");
        return "[age=" + studentage + ", rollno=" + rollno + ", name=" + studentname + "]";
    }
    
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

}
