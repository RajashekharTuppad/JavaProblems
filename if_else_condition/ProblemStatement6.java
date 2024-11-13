package com.kd.if_else_condition;
/* Problem Statement 6: As an IT specialist at a university, you have been tasked to create 
  a program that helps in marking student's grades. The program should take a student's score 
  as an input. If the score is 60 or above, the program should print "Passed". 
  In all other cases, it should print "Failed". */


import java.util.Scanner;
public class ProblemStatement6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Score  ");
        int score = scan.nextInt();
        scan.close();
        
       boolean isscore=  isscore(score);
    		   if(isscore==true)
    		   {
    			   System.out.println(" PASSED");
    		   }else
    		   {
    			   System.out.println("FAILED ");
    		   }
	}

	 static boolean isscore(int score) {
		if(score>=65) {
			return true;
		}else {
			return false;
		}
	}

	}

/* output  
 	Enter The Score  
60
FAILED 
 */

/*
Enter The Score  
75
 PASSED
 */


