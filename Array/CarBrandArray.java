package com.kd.Array;



import java.util.Scanner;

public class CarBrandArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// Array declaration//
		String[][] car;
		// array creation
		
		System.out.println("Enter the base dimension(no of car brands):");
		car=new String[scan.nextInt()][];
		
		for(int i=0;i<car.length;i++) {
			System.out.print(" car" + (i+1) + " name brand  =");
			 car[i]= new String[scan.nextInt()];
			}
		
		//array initialization
		
		for(int i=0;i<car.length;i++) {
					System.out.println(" car brand "+ (i+1) + " name");
			for(int j=0;j<car[i].length;j++) {
				System.out.print("car name no "+ (j+1)+ " is=");
				
				  car[i][j]=scan.next();
			}
		}
		     System.out.println("all cars are:");
			for(int i=0;i<car.length;i++) {
				for(int j=0;j<car[i].length;j++) {
						System.out.println(car[i][j]);
			}
		}
		scan.close();
	}
		
}

	/*  output
	 Enter the base dimension(no of car brands):2
 car1 name brand  =2
 car2 name brand  =3
 car brand 1 name
car name no 1 is=maruti
car name no 2 is=mahindra
 car brand 2 name
car name no 1 is=ford
car name no 2 is=lamborgini
car name no 3 is=xuv
all cars are:
maruti
mahindra
ford
lamborgini
xuv

	 */

