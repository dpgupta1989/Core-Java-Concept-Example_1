package com.java.collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		System.out.println("Inside HashSetExample");
		HashSet<String> hset = new HashSet<String>();
		hset.add("Kolkata");
		hset.add("Bangalore");
		hset.add("Delhi");
		hset.add("Kolkata");
		hset.add(null);
		
		System.out.println(hset);
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()){
			System.out.println("Printing hashSet Value using Iterator : " + itr.next());
		}
		
		HashSet<Student> hset1 = new HashSet<Student>();
		Student s1 = new Student(223, "Chaitanya", 26);
		System.out.println("printing Student Object : " + s1);
		hset1.add(s1);
		System.out.println("Size of the HashSet : " + hset1.size());
		System.out.println("HashSet is empty : " + hset1.isEmpty());
		System.out.println("HashSet contains : " + hset1.contains(s1));
		
	}
}
