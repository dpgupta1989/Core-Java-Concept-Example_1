package com.java.interviewQuestions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Find3LargestValueArrayList {
	
	public static void main(String args[]) {
		   
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);	arrayList.add(-8);	arrayList.add(-7);	arrayList.add(4);	arrayList.add(5);
		
		System.out.println("@@@@@@@@@@@ Provided ArrayList :" + arrayList);
		Set<Integer> treeSet = new TreeSet<Integer>(Collections.reverseOrder());
		treeSet.addAll(arrayList);
		System.out.println("@@@@@@@@@@@ ArrayList after sorting :" + treeSet);
		
		Iterator<Integer> itr = treeSet.iterator();
		
		Integer i=1;int flag=1;
		while(itr.hasNext()){
			i = i*(Integer) itr.next();
			if(flag==3){
				break;
			}
			flag++;
			
		}
		System.out.println("@@@@@@@@@@@ Multiply of 3 largest value in the arraylist using Iterator is : " + i);
		
		int i2=1;int flag2=1;
		for(int i1 : treeSet){
			i2=i2*i1;
			flag2++;
			if(flag2==3){
				break;
			}
		}
		
		System.out.println("@@@@@@@@@@@ Multiply of 3 largest value in the arraylist using Enhanced forloop is : " + i2);
	   }
}