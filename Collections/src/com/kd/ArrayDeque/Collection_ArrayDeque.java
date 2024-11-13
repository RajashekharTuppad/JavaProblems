package com.kd.ArrayDeque;

import java.util.*;

public class Collection_ArrayDeque {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(100);
		ad.add(200);
		ad.add(300);
		ad.add(400);
		ad.add(500);
		ad.add('r');
		ad.add("Raj");
		ad.add(101);
		
		System.out.println("****************************************");
		System.out.println("The Elements present in the ArrayDeque is:");
		System.out.println(ad);
		
		System.out.println("*********************************************");
		System.out.println("::Adding of the elements at the First:::");
		ad.addFirst("First");
		System.out.println(ad);
		
		System.out.println("*********************************************");
		System.out.println("::Adding of the elements at the Last:::");
		ad.addLast("Last");
		System.out.println(ad);
		
		System.out.println("*********************************************");
		System.out.println("::Getting of the elements in the ArrayDeque:::");
		System.out.println(ad.getFirst());
		
		
		System.out.println("*********************************************");
		System.out.println("::Getting of the elements in the ArrayDeque:::");
		System.out.println(ad.getLast());
		
	}

}
