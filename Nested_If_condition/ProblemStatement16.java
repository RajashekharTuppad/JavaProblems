package com.kd.Nested_If_condition;

/*   roblem Statement 16: As a part of a traffic management system,
    you are creating a program that determines a person's eligibility for a driving license
     based on their age and eyesight score (out of 10).
      The program should take age and eyesight score as inputs.
       A person is eligible for a driving license if they are at least 18 years old and their eyesight score is 6 or above. 
       If both conditions are met, the program should print "Driving License Eligible". */ 

import java.util.Scanner;
public class ProblemStatement16 {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
			
			System.out.print("Enter the Age:");
			int age =scan.nextInt();
			
			System.out.print("Enter the Eyesight score (out of 10):");
			int eyesight =scan.nextInt();
			
			license(age,eyesight);
			
			scan.close();
		}

		 static void license(int age, int eyesight) {
			if(age>=18) {
				System.out.println("At the Age of " + age +  "  Eligible for Driving");
				
				if(eyesight>=6  && eyesight<=10) {
					System.out.println("Eye Sight condition also good");
					System.out.println(" Driving License Approved");
				}  
				else {
					System.out.println("Licence Not Approved  Due to Eye Condition");
				}
			}
	            else {
				System.out.println("Driving License not Eligible");
			}
				}
			}
			
/*
   output
   
   Enter the Age:21
   Enter the Eyesight score (out of 10):7
	At the Age of 21  Eligible for Driving
	Eye Sight condition also good
 	Driving License Approved
 	
 	Enter the Age:18
Enter the Eyesight score (out of 10):5
At the Age of 18  Eligible for Driving
Licence Not Approved  Due to Eye Condition


Enter the Age:17
Enter the Eyesight score (out of 10):8
Driving License not Eligible
 		
 */

