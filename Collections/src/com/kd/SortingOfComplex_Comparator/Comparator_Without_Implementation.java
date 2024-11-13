package com.kd.SortingOfComplex_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.kd.SortingOfComplexObjects_Comparable.Student;

public class Comparator_Without_Implementation {

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
		
		
	//	Collections.sort(studentlist);
		
		// only in java 8 version
		
		Collections.sort(studentlist,new Comparator<Student>()
				{
			public int compare(Student s1, Student s2) {
				if(s1.id>s2.id) {
					return 1;
				}else if(s1.id<s2.id) {
					return -1;
				}else {
					return 0;
				}
				
				}
				}
		);
		
		System.out.println("");
		System.out.println(":::::After Sorting Based on ID::::");
		System.out.println(studentlist);
		
		
		Collections.sort(studentlist,new Comparator<Student>(){
			public int compare(Student s1,Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		System.out.println("");
		System.out.println(":::::After Sorting Based on Name::::");
		System.out.println(studentlist);
		
		
		Collections.sort(studentlist,new Comparator<Student>(){
			public int compare(Student s1,Student s2) {
				if(s1.percentage>s2.percentage) {
					return 1;
				}else if(s1.percentage<s2.percentage) {
					return -1;
				}else {
					return 0;
				}
				
			}
		});
		System.out.println("");
		System.out.println(":::::After Sorting Based on percentage::::");
		System.out.println(studentlist);
		

	}

}
