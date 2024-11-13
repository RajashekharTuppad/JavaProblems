package com.kd.creating_Thread_implementsRunnable_interface;

public class PrintNumber implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("The Numbers are :"+i);
			
			/* sleep method and exception handling */
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	

}
