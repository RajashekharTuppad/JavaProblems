package com.kd.ArrayList;
import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add('a');
		list.add("Ten");
		list.add(10);
		
		
		
		System.out.println("*************************************************");
		System.out.println("The Elements in the Array is:");
		System.out.println(list);
		
		System.out.println("*************************************************");
		System.out.println("The size of the Given Array is-->"+list.size());
		
		System.out.println("*************************************************");
		System.out.println("Data at this index(0) is-->"+list.get(0));
		
		System.out.println("*************************************************");
		System.out.println("Adding of data in the list:");
		list.add(3, 1111);
		System.out.println(list);
		
		System.out.println("*************************************************");
		System.out.println("adding at specified place of data in the list:");
		list.add(3, 333);
		System.out.println(list);
		
		
		System.out.println("*************************************************");
		System.out.println("set replaces the  data in the list:");
		list.set(3, 6565);
		System.out.println(list);
		
		
		System.out.println("*************************************************");
		System.out.println("indexof(30)-->"+list.indexOf(30));
		
		System.out.println("*************************************************");
		System.out.println("indexof(10) is -->"+list.indexOf(30));
		
		System.out.println("*************************************************");
		System.out.println("lastindexof(10)-->"+list.lastIndexOf(10));
		
		System.out.println("*************************************************");
		System.out.println("indexof(30)at -->"+list.indexOf(30)+" position");
		
		// create another array as Array2
		ArrayList list2=new ArrayList();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		
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
