package com.prateek.creational.factory;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		
		System.out.println("building small car");
		
	}

}
