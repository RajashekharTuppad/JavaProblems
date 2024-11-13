package ifelsecondition;

import java.util.Scanner;

public class PositiveDiff {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the two numbers=");
		
		int a =scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		
		if(a>b) {
			
		System.out.println("Difference of two numbers="+(a-b));
		
		}
	
		else
		{
			System.out.println("Difference of two numbers="+(b-a));
		
		}

	}
	

}
