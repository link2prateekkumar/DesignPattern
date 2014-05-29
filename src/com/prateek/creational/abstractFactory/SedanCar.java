package com.prateek.creational.abstractFactory;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		
	}

	@Override
	protected void construct() {
		
		System.out.println("Building sedan Car");
	}

}
