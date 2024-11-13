package ifelsecondition;

//Write a java program to check whether the given number is positive or negative//

import java.util.Scanner;

public class PosorNeg {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number=");
		
		int num =scan.nextInt();
	
		if(num>=0) {
			
		System.out.println("The given number is POSITIVE");
		
		}
	
		else
		{
			System.out.println("The given number is NEGATIVE");
		
	}
       scan.close();
}
}