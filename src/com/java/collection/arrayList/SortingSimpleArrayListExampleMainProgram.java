package com.java.collection.arrayList;
import java.util.ArrayList;
import java.util.Collections;
public class SortingSimpleArrayListExampleMainProgram {
	
	   public static void main(String args[]) {
		   
//		   Creation of ArrayList
		   ArrayList<String> a1 = new ArrayList<String>();
		   System.out.println("Inside ArrayList :" + a1);
		   
//		   This is how elements should be added to the array list
		   a1.add("Dablu");
		   a1.add("Shariq");
		   a1.add(0, "Nikhil");
		   a1.add(1, "Pankaj");
		   
		   System.out.println("Currently the array list has following elements:" + a1);
		   
		   Collections.sort(a1);
		   System.out.println("############## After Sorting in Ascending Order:" + a1);
		   Collections.reverse(a1);
		   System.out.println("############ After Sorting in Descending Order :" + a1);
	   }
}