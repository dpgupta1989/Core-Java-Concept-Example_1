package com.java.interviewQuestions;

	public class StringExample {
		
		public static void main(String args[]) {
			   
			  String s1="ABC";
			  String s2="ABC";
			  String s3 = new String("ABC");
			  
			  System.out.println(s1==s2);
			  System.out.println("s1==s2 :" + s1 == s2);
			  System.out.println("s1==s3 :" + s1==s3);
			  System.out.println("s1.equals(s2) :" + s1.equalsIgnoreCase(s2));
			  System.out.println("s1.equals(s3) :" + s1.equalsIgnoreCase(s3));
//			  System.out.println("2-" + s1.equals(s2));
//			  System.out.println("2-" + s1.compareTo(s2));
			  
			  
	}
}
