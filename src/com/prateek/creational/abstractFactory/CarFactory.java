package com.prateek.creational.abstractFactory;

public class CarFactory {
	
	private CarFactory(){
		
	}
	
	public static Car buildCar(CarType type){
		
		Car car=null;
		
		Location location=new Utill().getProperty("country");
				switch (location) {
				case USA:
					car= USACarFactory.buildCar(type);
					break;
				case ASIA:
					car=ASIACarFactory.buildCar(type);
					break;
				default:
					car=DefaultCarFactory.buildCar(type);
					break;
				}
		return car;
	}

}
