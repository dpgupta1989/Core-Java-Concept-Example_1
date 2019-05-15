package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetHashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "One");
		hmap.put(2, "Two");
		hmap.put(3, "Three");
		hmap.put(6, "Six");
		System.out.println(hmap.get(2));
		System.out.println(hmap);
	      
	      /* Display content using KeySet*/
	    Set setOfKeys = hmap.keySet();
	    Iterator itr = setOfKeys.iterator();
	    while(itr.hasNext()){
	    	  Integer key = (Integer) itr.next();
	    	  String value = hmap.get(key);
	    	  System.out.println(key + "-" + value);
	    }
	      
	      /* Display content using Map.Entry Interface*/
	      Set set = hmap.entrySet(); //entry set will create a view for the hmap and put it in set
	      System.out.println("set :" + set);
	      Iterator iterator = set.iterator();
	      System.out.println("iterator :" + iterator);
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next(); // to iterate the hmap set we again need to take the map entry  
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	}
}
