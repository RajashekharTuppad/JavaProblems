package com.kd.simple_if_condition;

/*   Problem Statement 4: Your task is to create a program for a voting registration system. 
     According to the law, a person is eligible to vote if their age is 18 or above. 
     Your Java program should accept a person's age as input. If the age is 18 or above,
     the program should print "Voter registration eligible".*/


import java.util.Scanner;
public class ProblemStatement4 {

	public static void main(String[] args) {
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println(" Enter The Age of The Person ");
     int age = scan.nextInt();
      boolean isage = isage(age);
          if(isage==true)
{
	System.out.println(" Voter Registration Eligible ");
}else {
	System.out.println(" Voter Registration  Not Eligible");
}

scan.close();
		
	}

	 static boolean isage(int age) {
		 if(age>=18) {
			 return true ;
		 }else {
			 return false;
		 }
	 }
}
 /*  Enter The Age of The Person 
19
 Voter Registration Eligible
 
  
  
  
   Enter The Age of The Person 
17
 voter registration not eligible 

*/
	


