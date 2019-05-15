package com.java.collection.arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class HowToLoopArrayListMainProgram {
	
	public static void main(String args[]) {
		   
		   ArrayList<Country> a1 = new ArrayList<Country>();
		   Country c1 = new Country("India", "Hindi");
		   Country c2 = new Country("China", "Chinese");
		   a1.add(c1); 
		   a1.add(c2);
		   
		   /* For Loop for iterating ArrayList */
		   iteratingArrayListUsingForLoop(a1);
		   
		   /* Advanced For Loop for iterating ArrayList*/
		   iteratingArrayListUsingAdvancedForLoop(a1);
		   
			/* While Loop for iterating ArrayList*/
		   iteratingArrayListUsingWhileLoop(a1);
		   
//		   Collections.sort(a1); 
		   /*Looping Array List using Iterator*/
		   iteratingArrayListUsingIterator(a1);
	   }

	private static void iteratingArrayListUsingIterator(ArrayList<Country> a1) {
		System.out.println("###################Looping ArrayList using Iterator ");
		Iterator<Country> itr = a1.iterator();
		while(itr.hasNext()){
//			Country country = itr.next();
			System.out.println(itr.next().getName() + "-" + itr.next().getLanguage());
//			System.out.println(country.getName() + "-" + country.getLanguage());
		}
	}

	private static void iteratingArrayListUsingWhileLoop(ArrayList<Country> a1) {
		
		System.out.println("###################Looping ArrayList using while loop "); 		
	      int count = 0; 		
	      while (a1.size() > count) {
		  System.out.println(a1.get(count).getName() + "-" + a1.get(count).getLanguage());
	      count++;
	      }
		
	}

	private static void iteratingArrayListUsingAdvancedForLoop(ArrayList<Country> countryList) {
		System.out.println("###################Looping ArrayList using Advanced For Loop ");	
		for(Country i : countryList){
			System.out.println(i.getName() + "-" + i.getLanguage());
			
		}
	}

	private static void iteratingArrayListUsingForLoop(ArrayList<Country> countryList) {
		System.out.println("###################Looping ArrayList using for loop ");
		for(int i=0; i<countryList.size();i++){
			System.out.println(countryList.get(i).getName() + "-" + countryList.get(i).getLanguage());
		}
	}
	
}