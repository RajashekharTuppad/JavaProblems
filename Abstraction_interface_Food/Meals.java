package com.kd.Abstraction_interface_Food;

public class Meals implements MainCourse, Starter, Desert {

	@Override
	public void Uta() {
		System.out.println("Uta madri");

	}

	@Override
	public void Drinks() {
		System.out.println("Nerr Kudi");

	}

	@Override
	public void Gobi() {
		System.out.println(" Gobi Tinnri");
	}

	@Override
	public void IceCream() {
		System.out.println("Enjoy Icecream");
	}

	@Override
	public void enjoy() {
		System.out.println("Bill Kodri");

	}

	@Override
	public void biryani() {
		System.out.println("Biryani Super");

	}

}
