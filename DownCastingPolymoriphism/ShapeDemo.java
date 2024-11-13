package com.kd.DownCastingPolymoriphism;

public class ShapeDemo {

	public static void main(String[] args) {
		
		// create Parent Object Reference
		Shape sh;
		
		// createchild up-casting to parent reference
		sh=new Circle();
		
		// Inherited method from Parent
		sh.draw();
		
		// Overriden method in child class
		System.out.println("Area of the Circle:"+sh.calArea());
		
		// CALLING cHILD specfic method using Down Casting to child reference
		System.out.println("Perimeter of the Given Circle:"+((Circle)(sh)).calPeri());
	
	System.out.println("===============================================");

			// createchild up-casting to parent reference
			sh= new Rectangle();
			
			// Inherited method from Parent
			sh.draw();
			
			// Overriden method in child class
			System.out.println("Area of the Rectangle:"+sh.calArea());
			
			// CALLING cHILD specfic method using Down Casting to child reference
			System.out.println("Perimeter of the Given Rectangle:"+((Rectangle)(sh)).calPeri());
			
	
	}
}
