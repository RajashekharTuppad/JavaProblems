package com.kd.Hashset;

import java.util.HashSet;

import java.util.LinkedHashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		System.out.println(":::::HashSet:::::");
		System.out.println("--- Does Not Maintain Inseration Order---");
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(33);
		set.add(55);
		set.add(45);
		set.add(100);
		set.add(-5);
		System.out.println(set);
		
		System.out.println("---------------------------------");
		
		
		System.out.println("::::LinkedHashSet:::::;");
		System.out.println("---Maintain Inseration Order---");
		LinkedHashSet<Integer> set1=new LinkedHashSet<>();
		set1.add(100);
		set1.add(80);
		set1.add(56);
		System.out.println(set1);
		//mentain  inseration order
	}

}
