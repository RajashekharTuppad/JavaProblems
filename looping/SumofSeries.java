package com.kd.looping;


import java.util.Scanner;
public class SumofSeries {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=scan.nextInt();
		
		sumofseries(num);
		scan.close();
		

	}

	 static void sumofseries(int num) {
		double sum=0;
		double i=1;
		while(i<=num) {
			sum=sum+(1/i);
			i++;
		}
		
		System.out.println("Total sum="+sum);
	 }
}

/*
Enter the Number:
2
Total sum=1.5*/