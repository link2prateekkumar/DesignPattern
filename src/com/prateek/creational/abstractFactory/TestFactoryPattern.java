package com.prateek.creational.abstractFactory;

public class TestFactoryPattern {
	
	public static void main(String [] args){
		
		System.out.print(Location.valueOf("ASIA"));
		
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		
	}

}
