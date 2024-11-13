package com.kd.Traversing_Elements;

import java.util.*;

public class Traversing_Elements {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Shirt");
		list.add("Pant");
		list.add("Cap");
		list.add(10);
		list.add(true);
		
		//Using for loop
		System.out.println("Using For Loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=====================================");
		// Using for-each loop
		System.out.println("Using For-Each Loop");
		for(Object s:list) {
			System.out.println(s+" ");
		}
		System.out.println("=====================================");
		System.out.println("Using Iterator");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		System.out.println("================================");
		
		
		System.out.println("-----------------------------------------------");
		
		
		//Backward Traversing
		System.out.println("::::Backward Traversing:::");
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(56);
		ad.add(256);
		
		//using descending Iterator
		System.out.println(" ArrayDeque Using Iterator");
		Iterator itr1=ad.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("::::Backward Traversing:::");
		System.out.println("ArrayList Backward Traversing using Iterator");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ListIterator<Integer> itr2=al.listIterator(al.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous()+" ");
		}
		
		}

}
