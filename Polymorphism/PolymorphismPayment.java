package com.kd.Polymorphism;

public class PolymorphismPayment {

	public static void main(String[] args) {
		
		Payment p = new Payment();
			
			
			System.out.println("UPI METHOD");
			
			p=new UPI();
			p.bill();
			p.offer();
			p.pay();
			
			
			System.out.println("WALLET PROMO CARD  METHOD");
			p=new Wallet();
			p.bill();
			p.offer();
			p.pay();
			
			
			System.out.println("BY USING CARD METHOD");
			p=new Card();
			p.bill();
			p.offer();
			p.pay();
			

		

	
	}

}
