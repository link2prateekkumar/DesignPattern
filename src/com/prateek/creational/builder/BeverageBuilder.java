package com.prateek.creational.builder;

public abstract class BeverageBuilder {
	
	private Beverage bevarage;

	public Beverage getBevarage() {
		return bevarage;
	}

	public void setBevarage(Beverage bevarage) {
		this.bevarage = bevarage;
	}
	
	public final Beverage buildBeverage(){
		Beverage bevarage= createBeverage();
		setBevarage(bevarage);
		setBeverageType();
		setWater();
		setMilk();
		setSuger();
		setPowderQuantity();
		return bevarage;
		
	}
	
	abstract void setBeverageType();
	abstract void setWater();
	abstract void setMilk();
	abstract void setSuger();
	abstract void setPowderQuantity();
	abstract Beverage createBeverage();
	

}
