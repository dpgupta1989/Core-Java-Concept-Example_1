package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Dablu");
		hmap.put(2, "Shariq");
		hmap.put(23,"Nikhil");
		hmap.put(6, "Narendra");
		System.out.println(hmap.get(2));
		System.out.println(hmap);
	      
	      hmap.remove(6);
	      if(hmap.containsKey(2)) System.out.println("Key Found");
	      if(hmap.containsValue("Nikhil")) System.out.println("Value Found");
	      
	      /* Display content using KeySet*/
	      Set setOfKeys = hmap.keySet();
	      Iterator itr = setOfKeys.iterator();
	      while(itr.hasNext()){
	    	  Integer key = (Integer) itr.next();
	    	  String value = hmap.get(key);
	    	  System.out.println(key + "-" + value);
	      }
	}

}
