package com.kd.Generics_In_Java;

import java.util.*;

public class TypeSafety_Generics_In_Java {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		pq.add(60);
		//pq.add("Ten");//Generate Compile time error due to type safety

		
		PriorityQueue<String> pq1=new PriorityQueue<String>();
		pq1.add("Raj");
		pq1.add("Mahesh");
		pq1.add("Kartik");
		pq1.add("Shahid");
		pq1.add("Megharaj");
		//pq.add(10);//Generate Compile time error due to type safety
		

		PriorityQueue<String> p=new PriorityQueue<String>();
		p.add("RoyalRaj");
		p.add("SuperMan");
		
		p.addAll(pq1);
		System.out.println(pq);
		System.out.println(pq1);
		System.out.println(p);
		
	}

}
