package com.kd.Sorting_of_Simple_Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
public class By_Using_TreeSet {

	public static void main(String[] args) {
	TreeSet<Integer> set=new TreeSet<Integer>();
	set.add(20);
	set.add(30);
	set.add(10);
	set.add(50);
	System.out.println(":::Using TreeSet:::"+set);
	
	System.out.println("=========================================== ");
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(456);
	list.add(39);
	list.add(61);
	list.add(28);
	System.out.println("::::::Using Collections.sort()method::::::");
	
	System.out.println("List before sorting::"+list);
	Collections.sort(list);
	System.out.println("List after sorting::"+list);
	

	}

}
