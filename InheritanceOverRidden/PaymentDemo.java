package com.kd.InheritanceOverRidden;

public class PaymentDemo {

	public static void main(String[] args) {
		
		
		System.out.println("UPI METHOD");
		UPI u=new UPI();
		u.bill();
		u.offer();
		u.pay();
		
		
		System.out.println("WALLET PROMO CARD  METHOD");
		wallet w=new wallet();
		w.bill();
		w.offer();
		w.pay();
		
		
		System.out.println("BY USING CARD METHOD");
		card c=new card();
		c.bill();
		c.offer();
		c.pay();
		

	}

}
