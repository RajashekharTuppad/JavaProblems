package com.kd.else_if_ladder;


/* Problem Statement 13: You're creating a program for a community center that categorizes individuals 
  based on their age for different activities. The program should accept an age as input. 
  For age between 0 and 12, it should print "Child". 
  For age between 13 and 19, it should print "Teen". 
  For age between 20 and 59, it should print "Adult". 
  For age 60 and above, it should print "Senior Citizen". */

import java.util.Scanner;
public class ProblemStatement13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age =scan.nextInt();
		
		communitycentre(age);
		System.out.println("Life become unpreticable at any age,So have faith in yourself");
		scan.close();
	}

       static void communitycentre(int age) {
    	   if(age>=0 && age<=12){
    		   System.out.println("Child");
    	   }else if(age>=13 && age<=19) {
    		   System.out.println("Teen");
    	   }
    	   else if(age>=20 && age<=59) {
    		   System.out.println("Adult");
    	   }
    	   else {
    		   System.out.println("Senior Citizen");
    	   }
       } 

	}

/*
 output
 
 
 Enter the Age:
22
Adult

Enter the Age:
5
Child

Enter the Age:
15
Teen


Enter the Age:
65
Senior Citizen

 */
 

