package com.kd.ExceptionHandling;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shopping_App {

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping Apllication...!");
		shop();
		System.out.println("Thank you for using Shopping Application...!");
	}

	private static void shop() {
		System.out.println(".......Shop method() started........");
		try {
		pay();
		}catch(InputMismatchException ime) {
			System.out.println("Shopping is failed due to the inappropiate input....!");
			ime.printStackTrace();
		}
		System.out.println(".......Shpo method() ended.......");
		
	}

	@SuppressWarnings("resource")
	private static void pay() throws  InputMismatchException {
		System.out.println(".......pay() method started........");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Amount:");
		double amount=0;
		try {
			amount=scan.nextDouble();
		}catch(AnnotationTypeMismatchException ime) {
			System.out.println("..Exception Handled in pay() method..");
			ime.printStackTrace();
			throw ime;// re-throwing exception
		}
		System.out.println("Amount Paid:"+amount);
		System.out.println("......pay() method ended.......");
		scan.close();
	}

}

/*
 * Welcome to Shopping Apllication...!
.......Shop method() started........
.......pay() method started........
Enter the Amount:
10000
Amount Paid:10000.0
......pay() method ended.......
.......Shpo method() ended.......
Thank you for using Shopping Application...!









Welcome to Shopping Apllication...!
.......Shop method() started........
.......pay() method started........
Enter the Amount:
ten thousand
Shopping is failed due to the inappropiate input....!
java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at com.kd.ExceptionHandling.Shopping_App.pay(Shopping_App.java:32)
	at com.kd.ExceptionHandling.Shopping_App.shop(Shopping_App.java:17)
	at com.kd.ExceptionHandling.Shopping_App.main(Shopping_App.java:10)
.......Shpo method() ended.......
Thank you for using Shopping Application...!

 */





