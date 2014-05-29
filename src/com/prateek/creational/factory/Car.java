package com.prateek.creational.factory;

public abstract class Car {
	
	private CarType model;
	
	public Car(CarType model){
		this.model=model;
		// call some default methods for everyone
	}
	
	protected abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
	public String toString(){
		
		return "Factory with model ---- "+model;
		
		
	}

}
