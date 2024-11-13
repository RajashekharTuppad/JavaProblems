package com.kd.simple_if_condition;


/*Problem Statement 2: Imagine you're designing the software for a new extreme roller coaster 
 ride in an amusement park. The roller coaster has an age restriction - only individuals
  12 years or older are allowed on the ride. Your program should take as input the age of
   a visitor. If the age is 12 or above, the program should print "Ride access granted".*/


import java.util.Scanner;
public class ProblemStatement2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			System.out.println("enter the age of the person");
		    int age = scan.nextInt();
		    boolean isage =isage(age);
		    if(isage == true)
		    {
		    	System.out.println("Ride  access granted ");
		    }else {
		    	System.out.println("ride access denied ");
		    }scan.close();
			}

			 static  boolean isage(int age) {
				if(age>=12) {
					return true;
				}else {
					return false;
				}
			}

		} 

				

		/* output 
		*enter the age of the person
		25
		ride access granted 

		enter the age of the person
		10
		ride access denied 

		*/
	


