package com.java.interviewQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class FindMissingElementFromArrayList {
	
	public static void main(String args[]) {
		   
		   ArrayList<Integer> a1 = new ArrayList<Integer>();
		   System.out.println("ArrayList  :" + a1);
		   a1.add(2);
		   a1.add(3);
		   
//		   Create a method to find out the missing element in an array
		   inspectMissingElement(a1);
		   System.out.println("ArrayList initialization :" + a1);
	   }

	private static void inspectMissingElement(ArrayList<Integer> a1) {
		
		Collections.sort(a1);
		for(int i=1 ; i<=a1.size();i++){
			if(!a1.contains(i)){
				System.out.println("Missing element found :" + i);
				break;
			}
		}
	}
}