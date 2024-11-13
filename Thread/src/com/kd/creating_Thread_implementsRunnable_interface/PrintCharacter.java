package com.kd.creating_Thread_implementsRunnable_interface;

public class PrintCharacter implements Runnable {

	@Override
	public void run() {
		for(int i=65;i<=69;i++) {
			System.out.println("The Char is:"+(char)(i));
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	

}
