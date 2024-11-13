package ifelsecondition;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=scan.nextInt();
		if(age>18)
		System.out.println("ELIGIBLE FOR VOTING");
		else
			System.out.println("NOT ELIGABLE FOR VOTING");
	}

}
