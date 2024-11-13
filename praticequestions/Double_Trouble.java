package com.kd.praticequestions;

import java.util.Scanner;
public class Double_Trouble
{

	public static void main(String[] args) 
	{
		
		Scanner scan =new Scanner(System.in);
		
		int output= doubleTheNumber(15);
		
		System.out.println("The doubleTheNumber is = "+output);
		scan.close();
		
	}
		static int  doubleTheNumber( int num)
		{
	     int number=num*2;
		return number;
		
		
		
		}
}



