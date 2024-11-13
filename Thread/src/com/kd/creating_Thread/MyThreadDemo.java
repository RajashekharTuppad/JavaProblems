package com.kd.creating_Thread;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		Thread t2=Thread.currentThread();
		System.out.println("Current Thread of t2 is:"+t2);
		
		MyThread t1=new MyThread();
		t1.start();
		t1.setName("MyThread");
		t1.setPriority(7);	
	}

}

/*
Current Thread of t2 is:Thread[main,5,main]
Current Thread of t1 is:Thread[MyThread,7,main]
*/

/*********************************************************************/

/*  if the priority is above 10 or below 0(negative) the error will occur is
 
 
Current Thread of t2 is:Thread[main,5,main]
Exception in thread "main" Current Thread of t1 is:Thread[MyThread,5,main]
java.lang.IllegalArgumentException
	at java.base/java.lang.Thread.setPriority(Thread.java:1138)
	at com.kd.creating_Thread.MyThreadDemo.main(MyThreadDemo.java:13)
*/