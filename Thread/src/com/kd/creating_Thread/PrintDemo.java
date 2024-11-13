package com.kd.creating_Thread;

public class PrintDemo {

	public static void main(String[] args) {
		
		PrintNum t1=new PrintNum();
		t1.start();
		
		
		
		PrintChar t2 =new PrintChar();
		t2.start();	
		
		
	}

}
/*
 **************************
The Numbers are :1
The Numbers are :2
The Numbers are :3
The Numbers are :4
The Numbers are :5
The Char is:A
The Char is:B
The Char is:C
The Char is:D
The Char is:E
*/
