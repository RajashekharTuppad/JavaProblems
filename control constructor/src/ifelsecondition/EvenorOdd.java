package ifelsecondition;

//Write a java program to check whether the given number is EVEN or  ODD //

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number=");
		
		int num =scan.nextInt();
	
		if(num%2==0) {
			
		System.out.println("The given number is even");
		
		}
	
		else
		{
			System.out.println("The given number is odd");
		

	}

}
}