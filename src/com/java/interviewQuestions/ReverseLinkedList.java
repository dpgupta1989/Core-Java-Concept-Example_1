package com.java.interviewQuestions;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class ReverseLinkedList {
	
	public static void main(String args[]) {
		   
		   List<String> a1 = new LinkedList<String>();
		   a1.add("ABC");
		   a1.add("DEF");
		   a1.add("DEFG");
		   
		   System.out.println("Before :" + a1);
		   Collections.reverse(a1);
		   System.out.println("After :" + a1);
	   }
}