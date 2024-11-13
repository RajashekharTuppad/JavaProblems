package com.kd.Multi_Threading;

public class Thread_CurrentThread {

	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		System.out.println("Current Thread:::"+t1);
	}
}


/* output
Current Thread:::Thread[main,5,main]*/