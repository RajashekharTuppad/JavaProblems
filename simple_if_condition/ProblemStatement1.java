package com.kd.simple_if_condition;

/*Problem Statement 1: As a software developer, you're tasked with creating a 
 simple validation system for a data entry application.The application is meant to process 
 only positive integers. In order to guide user input,the system should print a guiding message 
"Positive number - processing..." if the entered number is greater than zero.*/


   import java.util.Scanner;
   public class ProblemStatement1 {
   
	public static void main(String[] args) {
		
		
			 Scanner scan = new Scanner(System.in);
			 System.out.println("enter the number ");
			 int number = scan.nextInt();
			 boolean ispositive = ispositive(number);
			if(ispositive==true) {
				System.out.println("the given number is " + number + "is Positive ");
			}else
			{
				System.out.println("the given number is" + number + "is Negative  ");
			}scan.close();
				}

				 static boolean ispositive(int number) {
					if(number>0) {
						
					 return true;
				} else 
				{
					return false;
				}
			}
   }
   
			// output	

			/*
			 * enter the number 
			15
			the given number 15is positive


			enter the number 
			-5
			the given number -5is Negative



			*/

	


