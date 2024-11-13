package com.kd.ReferencePolymorphism;

public class GeomentryDemo {

	public static void main(String[] args) {
		
		Geometry g= new Geometry();
		
		Rectangle r= new Rectangle();
		Square s= new Square();
		Circle c= new Circle();
		
		
		
		g.doActivity(r);
		g.doActivity(s);
		g.doActivity(c);
		

	}

}
