package com.kd.ExceptionHandling;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		try {
			System.out.println("Connection established with Bank Succesfully");
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the pin:");
			int pin=scan.nextInt();
			
			scan.close();
			
			if(pin==9999) {
				System.out.println("Welcome to ABC Bank");
			}else {
				System.out.println("Please enter correct pin");
			}
		}catch(Exception e) {
			System.out.println("Exception Occured");
		}	
		System.out.println("Thank you for using ABC Bank..!");
	}
}
/*
 * Connection established with Bank Succesfully
Enter the pin:
1234
Please enter correct pin
Thank you for using ABC Bank..!
 */


/*
Connection established with Bank Succesfully
Enter the pin:
9999
Welcome to ABC Bank
Thank you for using ABC Bank.
*/