package com.kd.Nested_If_condition;

/*  Problem Statement 20: You're creating a software for a university that determines whether
   a student is eligible for an honors degree. The program should take the student's GPA and 
   the number of courses completed as input.
    A student is eligible for an honors degree if they have a GPA of more than 3.5 and have completed more than 120 credits.
    If the student has the required GPA, it should then check the number of courses completed.
     If both conditions are met, it should print "Eligible for Honors Degree".*/

import java.util.Scanner;
public class ProblemStatement20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the number of cousrsecredits completed by the Student in the University: ");
		int coursecredits = scan.nextInt();
		
		System.out.println(" Enter the Marks of the Student in the cgpa: ");
		double cgpa = scan.nextDouble();
		
		iseligibleForhonors(coursecredits,cgpa);
		scan.close();
	}

	private static void iseligibleForhonors(int coursecredits, double cgpa) {
		if(coursecredits>120)
		{
			if(cgpa>3.7)
			{
				System.out.println(" eligible for honors ");
			}else {
				System.out.println(" not eligible for honors ");
			}
		}
		else {
			System.out.println(" not eligible ");
		}
		}
	}
	
/*  
 
 *output
  Enter the number of cousrsecredits completed by the Student in the University: 
125
 Enter the Marks of the Student in the cgpa: 
3.5
 not eligible for honors 
 
 
  Enter the number of cousrsecredits completed by the Student in the University: 
125
 Enter the Marks of the Student in the cgpa: 
4
 eligible for honors 
 
*/
