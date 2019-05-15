package com.java.collection.arrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExampleMainProgram {
	
	   public static void main(String args[]) {
		   
//		   Creation of ArrayList
		   ArrayList<String> a1 = new ArrayList<String>();
		   System.out.println("Inside ArrayList :" + a1);
		   
//		   This is how elements should be added to the array list
		   a1.add("Dablu");
		   a1.add("Shariq");
		   
		   System.out.println("1-Currently the array list has following elements: :" + a1);
		   
//		   Add element at the given index
		   a1.add(2, "Nikhil");
		   a1.add(3, "Nikhil");
		   System.out.println("2-Currently the array list has following elements: :" + a1);
		   
//		   Remove elements from array list
		   a1.remove("Nikhil");
		   System.out.println("3-Currently the array list has following elements: :" + a1);
		   
//		   Remove element from the given index
		   a1.remove(2-2);
		   System.out.println("4-Currently the array list has following elements: :" + a1);
		   
		   System.out.println("Final Size of the ArrayList :" + a1.size());
		   Collections.sort(a1);
		   System.out.println("############ After Sorting  :" + a1);
		   System.out.println("Checks whether the given object is present in ArrayList :" + a1.contains("Dablu"));
		   a1.clear();
		   System.out.println("Removed all the elements of the array list :" + a1);
	   }
}