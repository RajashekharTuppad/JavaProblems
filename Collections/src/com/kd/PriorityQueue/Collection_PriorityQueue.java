package com.kd.PriorityQueue;

import java.util.*;
public class Collection_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		pq.add(60);
		
		System.out.println("--------------------------------------------");
		System.out.println(pq);
		
		System.out.println("-------------------------------------------");
		pq.add(50);
		System.out.println(pq);
		
		System.out.println("-------------------------------------------");
		pq.add(20);
		System.out.println(pq);
		
		System.out.println("-------------------------------------------");
		pq.add(10);
		System.out.println(pq);
		
		//System.out.println("--------------------------------------------");
		//pq.add("Raj");
		//System.out.println(pq);
		//output
		/*error is caused and the reason is::
		 Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String 
		 */
		
		PriorityQueue pq1=new PriorityQueue();
		pq1.add("Raj");
		pq1.add("Mahesh");
		pq1.add("Kartik");
		pq1.add("Shahid");
		pq1.add("Megharaj");
		
		System.out.println("--------------------------------------------");
		System.out.println(pq1);
		
		System.out.println("-----------------------------------------------");
		PriorityQueue pq2=new PriorityQueue();
		pq2.add("Two");
		pq2.add("Twenty");
		pq2.add("Thirty");
		System.out.println(pq2);
		
	}

}
