package com.kn.Composition;

    public class Book {

    Page page;
	
	public Book(String content) {
		this.page=new Page(content);
	}

	
	public void readbook() {
		
		System.out.println("Book reading is in progress ....");
		page.displayContent();
	}

}
