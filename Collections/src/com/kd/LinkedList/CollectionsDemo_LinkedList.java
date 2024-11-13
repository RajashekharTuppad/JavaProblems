package com.kd.LinkedList;

import java.util.*;

public class CollectionsDemo_LinkedList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add('r');
		list.add("Raj");
		list.add(101);
		
		
		System.out.println("***************************************************");
		System.out.println("The elements in the given LinkedList are::");
		System.out.println(list);
		
		System.out.println("***************************************************");
		System.out.println("The size of the given LinkedList are::");
		System.out.println(list.size());
		
		System.out.println("***************************************************");
		System.out.println("Inseration of the element in the LinkedList::");
		list.add(3, 22);
		System.out.println(list);
		
		System.out.println("*************************************************");
		System.out.println("Data at this index(2) is-->"+list.get(2));
		
		System.out.println("*************************************************");
		System.out.println("Adding of data in the list:");
		list.add(3, 2222);
		System.out.println(list);
		
		System.out.println("*************************************************");
		System.out.println("adding at specified place of data in the list:");
		list.add(5, 25258);
		System.out.println(list);
		
		
		System.out.println("*************************************************");
		System.out.println("set replaces the  data in the list:");
		list.set(3, 565489);
		System.out.println(list);
		
		
		System.out.println("*************************************************");
		System.out.println("indexof(300)-->"+list.indexOf(300));
		
		System.out.println("*************************************************");
		System.out.println("indexof(100) is -->"+list.indexOf(100));
		
		System.out.println("*************************************************");
		System.out.println("lastindexof(101)-->"+list.lastIndexOf(101));
		
		System.out.println("*************************************************");
		System.out.println("indexof(Raj)at -->"+list.indexOf("Raj")+" position");
		
		
		LinkedList list2=new LinkedList();
		list2.add("Megharaj");
		list2.add("Kartik");
		list2.add("Shahid");
		list2.add("Mahesh");
		list2.add("RoyalRaj");
		
		System.out.println("*************************************************");
		System.out.println("The Elements in the  second Array is:");
		System.out.println(list2);
		
		System.out.println("*************************************************");
		System.out.println("::Adding of two different Array elements::");
		list2.addAll(list);
		System.out.println(list2);
		
		System.out.println("*************************************************");
		System.out.println("::Adding of two different Array elements at perfered position::");
		list2.addAll(2,list);
		System.out.println(list2);

	}

}
