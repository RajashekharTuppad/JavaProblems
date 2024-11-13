package com.kd.WrapperClass;

import java.util.*;
public class Wrapper_Class {

	public static void main(String[] args) {
		
	//	format how Wrapper Class Object Storing
	//	Integer i1=new Integer(10);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		//Auto Boxing
		list.add(10);     // list.add(new Integer(10));
		list.add(20);    // list.add(new Integer(20));
		list.add(30);	//	list.add(new Integer(30));
		System.out.println("Elements::"+list);
		
		System.out.println("--------------------------------------------");
		//Auto-UnBoxing
		int i1=list.get(0); //(int)list1.get(0)
		int i2=list.get(1); //(int)list2.get(1)
		int i3=list.get(2); //(int)list3.get(2)
		
		System.out.println("i1:"+i1);
		System.out.println("i2:"+i2);
		System.out.println("i3:"+i3);
		
	}

}
