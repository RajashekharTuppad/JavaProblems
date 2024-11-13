ckage com.kd.praticequestions;


import java.util.Scanner;

public class ProblemStatement11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num=scan.nextInt();
		
		
		isPosNegZero(num);
		scan.close();
		

	}

	 static void isPosNegZero(int num) {
		 
		 if(num>0) {
			 System.out.println("Given Number is "+num+" is Positive");
		 }
		 else if(num<0) {
			 System.out.println("Given Number is "+num+" is Negative");
		 }
		 else {
			 System.out.println("Given Number is:"+num);
		 }
		
		
	}

}


