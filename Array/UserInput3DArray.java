package com.kd.Array;


import java.util.Scanner;
public class UserInput3DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration
		int[][][] arr;

		// Array Creation

		System.out.println("Enter Main Base size(1st Array) = ");
		arr = new int[scan.nextInt()][][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter middle " + (i + 1) + " base size(2nd Array)  = ");
			arr[i] = new int[scan.nextInt()][];
	
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter last " + (j + 1) + " base size(Third Array) =");
				arr[i][j] = new int[scan.nextInt()] ;
			}
		}
		

		// Array Initialization
		System.out.println(" Enter data for Array Elemnet = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}

		// Array Traversing
		System.out.println("Data is as Follows ");
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
		scan.close();

}
}


/* 
  output
  Enter Main Base size = 
4
Enter middle 1 base size  = 
3
Enter last 1 base size =
1
Enter last 2 base size =
2
Enter last 3 base size =
3
Enter middle 2 base size  = 
1
Enter last 1 base size =
2
Enter middle 3 base size  = 
2
Enter last 1 base size =
1
Enter last 2 base size =
1
Enter middle 4 base size  = 
3
Enter last 1 base size =
1
Enter last 2 base size =
2
Enter last 3 base size =
2
 Enter data for Array Elemnet = 
10
20
30
40
50
60
70
80
90
100
110
120
130
140
150
Data is as Follows 
10
20
30
40
50
60
70
80
90
100
110
120
130
140
150
*/
 
	
