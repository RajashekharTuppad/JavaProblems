package com.kd.Encapsulation;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("The initial values are:");
		
		Student s1=new Student(0, null, 0, null);
		System.out.println("Roll number="+s1.getRollNumber());
		System.out.println("Name="+s1.getName());
		System.out.println("Marks="+s1.getMarks());
		System.out.println("Gender="+s1.getGender());
		
		
		System.out.println("After modification");
		s1.setRollNumber(02);
		s1.setName("RajLaxmi");
		s1.setMarks(65);
		s1.setGender("Female");
		
		System.out.println("Roll number="+s1.getRollNumber());
		System.out.println("Name="+s1.getName());
		System.out.println("Marks="+s1.getMarks());
		System.out.println("Gender="+s1.getGender());
		
        scan.close();
	}

}
