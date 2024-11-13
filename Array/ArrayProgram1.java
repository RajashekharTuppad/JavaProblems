package com.kd.Array;

import java.util.Scanner;
public class ArrayProgram1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		// Array Declaration
		String[] arr;
		
		// Array creation
		System.out.println("Enter the size of the Array:");
		arr=new String[scan.nextInt()];
		
		
		//Array initialization
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter"+(i+1)+"String data:");
			 arr[i]=scan.next();
		}
		System.out.println("Array Data as follows:");
		
	/*	// Array Transversing  forward
		for(int i=0;i<arr.length;i++) 
		
	
		System.out.println(arr[i]);
	}
		
}  */
/*
// output
Enter the size of the Array:
3
Enter1String data:
aaa
Enter2String data:
bb
Enter3String data:
c
Array Data as follows:
aaa
bb
c*/


// Array Transversing  backward
for(int i=arr.length-1;i>=0;i--) {
System.out.println(arr[i]);
}
  scan.close();
}
}


/* output

Enter the size of the Array:
3
Enter1String data:
aaa
Enter2String data:
bb
Enter3String data:
c
Array Data as follows:
c
bb
aaa  */