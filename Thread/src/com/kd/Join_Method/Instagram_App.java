package com.kd.Join_Method;

public class Instagram_App {

	public static void main(String[] args) {
		System.out.println("Instagram Application is Started");
		Chatting chatting=new Chatting();
		Reels reels=new Reels();
		chatting.start();
		reels.start();
		
		
		try {
			chatting.join();
			reels.join();
		}
		

	}

}

