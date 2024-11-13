package com.kd.switch_case_condition;

import java.util.Scanner;

/* Problem Statement 25: You are developing a software for a vending machine.
   The program should take a product code as input and output the product name. 
   The product codes are 1 for "Coke", 2 for "Pepsi", 3 for "Water", 4 for "Juice", 5 for "Tea". */

public class ProblemStatement25 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Product code:");
		int productcode =scan.nextInt();
		
		productname(productcode);
		System.out.println("Alcohol is injurious to health");
		scan.close();
	}
	
	static void productname(int productcode) {
		
	switch(productcode){
	case 1:
	System.out.println("Coke");
	break;

	case 2:
		System.out.println("Pepsi ");
		break;

	
	case 3:
		System.out.println("Water");
		break;
		
	case 4:
		System.out.println("Juice");
		break;
		
	case 5:
		System.out.println("Tea");
		break;
	
	default:
		System.out.println("Put the Glass and go ");
		break;
	}

}
}
/* 
 
 * output
 * 
 * Enter the Product code:
3
Water
Alcohol is injurious to health

Enter the Product code:
4
Juice
Alcohol is injurious to health
 
 */

	
