package com.prateek.creational.factory;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		
		System.out.println("building luxury car");
		
	}

}
