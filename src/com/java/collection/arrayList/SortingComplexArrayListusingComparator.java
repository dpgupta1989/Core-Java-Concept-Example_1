package com.java.collection.arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingComplexArrayListusingComparator {
	
	   public static void main(String args[]) { ArrayList<Employee> arraylist = new ArrayList<Employee>();
	   arraylist.add(new Employee("Shariq",3000));
	   arraylist.add(new Employee("Dablu",6000));
	   arraylist.add(new Employee("Nikhil",1000));
	   arraylist.add(new Employee("Pankaj",2500));

	   Collections.sort(arraylist, new Employee());
	   
       System.out.println("Sorted list entries: ");
       for(Employee e:arraylist){
           System.out.println(e.getName() + "-" + e.getSalary());
       }
	 }
}