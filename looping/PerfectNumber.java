package com.kd.looping;


import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=scan.nextInt();
		
		isPerfectNumber(num);
		scan.close();
		

	}

		static void isPerfectNumber(int num) {
		 
			int sum=0;
			int i=1;
			while(i<num) {
				
				if(num%i==0) {
					sum=sum+i;
					System.out.println(sum);
				}i++;
			}
			if(num==sum) {
				System.out.println("Perfect Number");
			}else
				System.out.println("Not Perfect Number");
	}

}


/* 
Enter the Number:
28
1
3
7
14
28
Perfect Number */