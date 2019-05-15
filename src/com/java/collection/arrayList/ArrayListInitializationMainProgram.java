package com.java.collection.arrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListInitializationMainProgram {
	
	   @SuppressWarnings("serial")
	public static void main(String args[]) {
		   
//		   Method 1: Initialization using Arrays.asList
		   ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("Mumbai", "Bangalore"));
		   System.out.println("ArrayList Initialization using Arrays.asList :" + a1);
		   
//		   Method 2: Anonymous inner class method to initialize ArrayList
		ArrayList<String> a2 = new ArrayList<String>(){{
			   add("Delhi");
			   add("Gujrat");
		   }};
		   System.out.println("ArrayList Initialization Anonymous inner class method :" + a2);
		   
//		   Method3: Normal way of ArrayList initialization
		   ArrayList<String> a3 = new ArrayList<String>();
		   a3.add("Chennai");
		   a3.add("Haidrabad");
		   System.out.println("Normal way of ArrayList initialization :" + a3);
	   }
}