package com.prateek.creational.factory;

public class SeedanCar extends Car {

	public SeedanCar() {
		super(CarType.SEDAN);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		
		System.out.println("building Seedan car");
		
	}

}
