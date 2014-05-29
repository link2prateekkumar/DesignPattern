package com.prateek.creational.abstractFactory;

public abstract class Car {

	private CarType type;
	private Location location;

	public Car(CarType type, Location location) {
		this.type = type;
		this.location = location;
	}

	protected abstract void construct();

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public String toString(){
		return "model   -"+type+" Location- "+location;
	}

}
