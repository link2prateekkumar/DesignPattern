package com.prateek.creational.factory;

public class CarFactory {

	public static Car buildCar(CarType model) {

		Car car = null;

		switch (model) {
		case SMALL:
				car=new SmallCar();
			break;

		case LUXURY:
				car=new LuxuryCar();
			break;

		case SEDAN:
				car=new SeedanCar();
			break;

		default:
			break;
		}

		return car;
	}

}
