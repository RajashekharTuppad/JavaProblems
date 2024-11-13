package com.kd.Nested_If_condition;

/*  Problem Statement 18: You are creating a program for a learning management system that checks the performance of a student in three tests.
   The program should accept scores of three tests.
    If all the scores are above 50, it should print "Passed All".
     If not, and if the average score is above 50, it should print "Average Score Passed".  */


import java.util.Scanner;
public class ProblemStatement18 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println(" enter the marks of the student ");
			
			int marks1 = scan.nextInt();
			int marks2 = scan.nextInt();
			int marks3 = scan.nextInt();
			
			
		isPassAndAverage(marks1,marks2,marks3);
		scan.close();		}
		
		static void isPassAndAverage(int marks1,int marks2,int marks3)
		{
		if(  marks1>=50 )	
		{
		 if(marks2>=50)
		 {
			 if(marks3>=50)
			 {
				 System.out.println(" Passed All ");
			 }else
			 {
				 System.out.println(" ");
			 }
		 }
		}
		if(marks1+marks2+marks3%3>=50)
		{
			System.out.println(" the average score is passed ");
		}else {
			System.out.println("   ");
		}
		}
	}

/* output
   
    enter the marks of the student 
50
50
50
 Passed All 
 the average score is passed 
 */

	
