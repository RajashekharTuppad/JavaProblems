package com.kd.Tree_Set;

import java.util.*;

public class Collection_Tree_Set {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(60);
		set.add(70);
		
	//	set.add(1.5); Hetrogenous Data Not Allowed
		
		set.add(100); //Duplicate Elements take input at onetime only
		set.add(100);
		set.add(100);      
		set.add(100);
		set.add(100);
		set.add(100);
		
		
		System.out.println("------------------------------");
		System.out.println(set);
		System.out.println("-------------------------------");

	}

}
/*
[10, 20, 30, 40, 60, 70, 100]
*/