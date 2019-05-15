package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortingByKeysDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");
        
        System.out.println("Before Sorting");
        Set set = hmap.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
        	Map.Entry me = (Map.Entry) itr.next();
        	System.out.println(me.getKey() + "-" + me.getValue());
        	
        }
        
        Map<Integer, String> hmap2 = new TreeMap<Integer,String>(hmap);
        
        System.out.println("After Sorting:");
        Set set2 = hmap2.entrySet();
        Iterator itr2 = set2.iterator();
        while(itr2.hasNext()){
        	Map.Entry me2 = (Map.Entry) itr2.next();
        	System.out.println(me2.getKey() + "-" + me2.getValue());
        }
	}	
}