package com.kd.SortingOfComplexObjects_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComplexSorting {

	public static void main(String[] args) {
		Student s1=new Student(11,"ABC",73.5);
		Student s2=new Student(33,"PQR",56.8);
		Student s3=new Student(22,"XYZ",83.5);
		
		ArrayList<Student> studentlist=new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		
		System.out.println(":::::Before Sorting:::::");
		System.out.println(studentlist);
		
		/* 
		 * 
		 *  Collections.sort(studentlist);
		 *  this method is not applicable directly because of complex sorting
		 *  that's reason we have to use 
		 *  1) Comparable(I)
		 *  2) Comparator(I)
		 
		*/
		
		
		Collections.sort(studentlist);
		
		
		System.out.println(":::::After Sorting::::");
		System.out.println(studentlist);
		
	}

}
