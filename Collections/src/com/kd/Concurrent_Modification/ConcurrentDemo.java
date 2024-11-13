package com.kd.Concurrent_Modification;

import java.util.ArrayList;

public class ConcurrentDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		int temp=40;
	//	concurrent modification with for loop---->Infinite Loop
		/*
		 * for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			list.add(temp); // reading
			temp+=10;//writing
		}*/
		
//		concurrent modification with for each loop---->concurrentmodificationException 
		for(Object i:list) {
			System.out.println(i+" ");//reading
			list.add(temp+=10);//writing
		}
	}

}
