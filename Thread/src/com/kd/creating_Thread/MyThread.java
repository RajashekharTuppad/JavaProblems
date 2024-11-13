package com.kd.creating_Thread;

public class MyThread extends Thread{
	
	public void run() {
		Thread t1=Thread.currentThread();
		System.out.println("Current Thread of t1 is:"+t1);
		
	}

}
