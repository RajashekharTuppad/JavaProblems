package com.kn.Composition;

public class CompositionDemo {

	public static void main(String[] args) {
		
	Book book = new Book ("Head First Java");
	
	book.readbook();
	System.out.println("--->Book got stollen");
	
	book = null;
	}

}
