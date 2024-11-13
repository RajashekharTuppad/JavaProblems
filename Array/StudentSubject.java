package com.kd.Array;


import java.util.Scanner;
public class StudentSubject {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		//enter the no of students//
		System.out.print("Enter the no of the Student:");
		int numberofstudents=scan.nextInt();
		
		// enter the subjects//
		System.out.print("Enter the no of subjects:");
		int numberofsubjects=scan.nextInt();

		//																																																																									 
		int[][] arr=new int[numberofstudents][numberofsubjects];
	}

}
