package ifelsecondition;

import java.util.Scanner;

public class TechFest {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the marks");
			int marks=scan.nextInt();
			if(marks>90)
			System.out.println("WELCOME TO TECHFEST");
			else
				System.out.println("SORRY U R ABLE TO ENTER THE FEST");

	}

}
