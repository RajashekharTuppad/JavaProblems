package com.kd.Abstraction_CarExample;

public   class AbstractionCarDemo {

	public static void main(String[] args) {
		
		ElectricalCar e=new ElectricalCar();
		e.start();
		e.stop();
		
		
		PetrolCar p =new PetrolCar();
		p.start();
		p.stop();
		p.refuel();
		
		DiselCar d=new DiselCar();
		d.start();
		d.stop();
		d.refuel();
		

	}

}
