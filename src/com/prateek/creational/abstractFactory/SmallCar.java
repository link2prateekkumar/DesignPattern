package com.prateek.creational.abstractFactory;

public class SmallCar extends Car {

	public SmallCar( Location location) {
		super(CarType.SMALL, location);
		
	}

	@Override
	protected void construct() {
		
		System.out.println("Building small Car");
		
	}

}
