package com.kd.if_else_condition;
/*  Problem Statement 31: You're designing a program for an employee benefits scheme.
   The program should check whether an employee is eligible for a bonus based on their years of service
    and monthly targets met. The program should take years of service and monthly targets met as inputs.
     An employee is eligible for a bonus if they have more than 3 years of service and have met more 
     than 6 monthly targets. If eligible, it should print "Bonus Eligible".*/

import java.util.Scanner;
public class ProblemStatement31 {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.print(" Enter years of Service :  ");
		       int yearsOfService = scan.nextInt();
		       
		       System.out.print(" Enter the Monthly targets :  ");
		       int monthlytarget = scan.nextInt();
		       
		       isBonusEligible(yearsOfService,monthlytarget);
		       scan.close();
			}

			private static void isBonusEligible(int yearsOfService, int monthlytarget) {
				if(yearsOfService>=3)
				{
					System.out.println(" Eligible for bonus  ");
					
			}else {
				System.out.println(" Not Eligible for Bonus due to less years of service ");
			}
		if(monthlytarget>=6)
		{
			System.out.println("  Eligible for bonus ");
		}
		else {
			System.out.println(" Not Eligible for Bonus due to montly target not achieved ");
		}
			

			
				
			}

		}
		
		/* 
		 * output
		 
		  	Enter years of Service :  4
 			Enter the Monthly targets :  7
 			Eligible for bonus 
  			Eligible for bonus 
  			
  			 Enter years of Service :  5
 			Enter the Monthly targets :  2
 			Eligible for bonus  
 			Not Eligible for Bonus due to montly target not achieved 
		 */
	
