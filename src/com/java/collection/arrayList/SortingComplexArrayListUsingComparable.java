package com.java.collection.arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingComplexArrayListUsingComparable {
	
	   public static void main(String args[]) { 
		   
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(223, "Chaitanya", 26));
	   arraylist.add(new Student(245, "Rahul", 24));
	   arraylist.add(new Student(209, "Ajeet", 32));
	   arraylist.add(new Student(209, "Ajeet", 3));

	   Collections.sort(arraylist);
	   System.out.println("Inside SortingComplexArrayListUsingComparable");
//	   for(Student str: arraylist){
//			System.out.println("Using For Loop : " + str);
//	   }
	   
	   Iterator<Student> itr = arraylist.iterator();
	   while(itr.hasNext()){
		   Student st=itr.next();
		   System.out.println("Using Iterator : " + st);
//		   System.out.println(st.getStudentage());
	   }
	   
	   
	 }
}