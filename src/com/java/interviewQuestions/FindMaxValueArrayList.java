package com.java.interviewQuestions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class FindMaxValueArrayList {
	
	public static void main(String args[]) {
		   
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);	arrayList.add(-8);	arrayList.add(-7);	arrayList.add(400);	arrayList.add(5);
		
		System.out.println("@@@@@@@@@@@ Max Value in ArrayList :" + Collections.max(arrayList));
		
	   }
}