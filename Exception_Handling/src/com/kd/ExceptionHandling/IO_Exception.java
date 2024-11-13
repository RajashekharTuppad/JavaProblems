package com.kd.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_Exception {

	public static void main(String[] args) {
		System.out.println("Program Started");
		try {
			takeinput();
		}catch(IOException e) {
			System.out.println("Exception Handled in main() method...!");
			e.printStackTrace();
		}
		System.out.println("Program ended succesfully...");
	}

	private static void takeinput() throws IOException {
		System.out.println("takeinput() has started");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String input=br.readLine();
		System.out.println("input="+input);
	}
}


/*
 * 
 Program Started
takeinput() has started
Raja
input=Raja
Program ended succesfully...
 */
