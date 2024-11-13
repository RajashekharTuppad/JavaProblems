package com.kd.creating_Thread;

public class PrintChar extends Thread {
	
	public void run() {
		
		for(int i=65;i<=69;i++) {
			System.out.println("The Char is:"+(char)(i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("**********");
	}


	

}
