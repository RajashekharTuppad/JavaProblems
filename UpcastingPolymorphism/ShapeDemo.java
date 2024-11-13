package com.kd.UpcastingPolymorphism;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape sh=new Shape();
		
		Rectangle r=new Rectangle();
		sh=r;
		sh.draw();
		System.out.println(sh.calArea());

		System.out.println("......************.........");
		
		Square s=new Square();
		sh=s;
		sh.draw();
		System.out.println(sh.calArea());

		System.out.println("......************.........");
		
		Circle c=new Circle();
		sh=c;
		sh.draw();
		System.out.println(sh.calArea());

	}
}
