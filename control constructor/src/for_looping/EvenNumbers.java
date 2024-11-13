package for_looping;


import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the number:");
		 int num=scan.nextInt();
		 
		 evennumber(num);
		 scan.close();

	}

	 static void evennumber(int num) {
		for(int i = 1;i<=num;i++) {
			if(num%2==0) {
				System.out.println("The given number is Even:");
			}
			else
				System.out.println("Not an Even Number");
			
		}
		
	}

}
