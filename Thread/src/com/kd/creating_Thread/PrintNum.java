package com.kd.creating_Thread;

public class PrintNum extends Thread {
	public void run(){
		for(int i=1;i<=5;i++) {
			System.out.println("The Numbers are :"+i);
			
			/* sleep method and exception handling */
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
