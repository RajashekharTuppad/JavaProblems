package com.kd.simple_if_condition;


/* Problem Statement 3: You're helping design the software for a retail store's automatic
  checkout system. There's a discount policy in place for purchases exceeding $200.
   Your Java program should take as input the total purchase amount. 
   If the total amount is more than $200, the program should print "Discount of 20% applicable".*/

import java.util.Scanner;
public class ProblemStatement3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the total amount of the purchase in $ is :");
        int price = scan.nextInt();
       boolean isprice=  isprice(price);
       if(isprice == true )
       {
    	   System.out.println(" apply 20% discount ");
       }else
       {
    	   System.out.println(" discount not applied");
       }
       scan.close();
	}

	static boolean isprice(int price) {
		if(price>=200)
		{
			return true ;
		}else
		{
			return false ;
		}
	}

} 


	


/* OUPUT 
 
  enter the total amount of the purchase in $ is :
200
 apply 20% discount 


enter the total amount of the purchase 
190
 discount not applied

*/
	


