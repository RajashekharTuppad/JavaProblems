package com.kd.praticequestions;

import java.util.Scanner;
public class ArthmeticOperations 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		
		
		int addition=addnumbers(num1,num2);
		int subtraction=subtractnumbers(num1,num2);
		double quotient=dividenumbers(num1,num2);
		int reminder=remindernumbers(num1,num2);
		int multiplication=multiplenumbers(num1,num2);
		System.out.println("sum="+addition+",diff="+subtraction+",div="+quotient+",rem="+reminder+",mul="+multiplication);
		scan.close();
	}
	 static int remindernumbers(int num1, int num2) {
		return num1%num2;
	}
	 static int multiplenumbers(int num1, int num2) {
		return num1*num2;
	}
	 static int subtractnumbers(int num1, int num2) {
		return num1-num2;
	}
	 static int addnumbers(int num1, int num2) {
		return num1+num2;
			
	}
	 static double dividenumbers(int num1, int num2) {
		
		return (double)num1 / (double)num2;
	}
	
}
