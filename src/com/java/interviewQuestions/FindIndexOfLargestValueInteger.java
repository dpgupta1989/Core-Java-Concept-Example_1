package com.java.interviewQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class FindIndexOfLargestValueInteger {
	
	public static void main(String args[]) {
		   
			Scanner scnr = new Scanner(System.in);
			int i = scnr.nextInt();
			System.out.println("I am here : " + i);
			inspectLargetValue(i);
	   }

	private static void inspectLargetValue(int i) {
		
		int maxDigit= i%10;
		int prevDigit=0;
		while(i!=0){
			prevDigit = i%10;
			if(maxDigit > prevDigit){
				maxDigit = maxDigit;
			}
			else{
				maxDigit = prevDigit;
			}
			i = i/10;
		}
		System.out.println("Max Digit :" + maxDigit);
	}
}