package com.prateek.creational.abstractFactory;

public class LuxuryCar extends Car {

	public LuxuryCar( Location location) {
		super(CarType.LUXURY, location);
		
	}

	@Override
	protected void construct() {
		
		System.out.println("Building luxury Car");
	}

}
