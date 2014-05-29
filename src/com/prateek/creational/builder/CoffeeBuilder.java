package com.prateek.creational.builder;

public class CoffeeBuilder extends BeverageBuilder {

	@Override
	void setBeverageType() {
		System.out.println("Coffee");
		getBevarage().setBreverageName("Coffee");
		
	}

	@Override
	void setWater() {
		
		System.out.println("STEP 1 ::: Boiling water");
		getBevarage().setWater(40);
		
	}

	@Override
	void setMilk() {
		System.out.println("STEP 2 ::: Adding MILK");
		getBevarage().setMilk(50);
		
		
	}

	@Override
	void setSuger() {
		System.out.println("STEP 3 ::: adding suger");
		getBevarage().setSuger(10);
	}

	@Override
	void setPowderQuantity() {
		System.out.println("STEP 4 ::: adding 9 gms of coffe powder");
		getBevarage().setPowderQuantity(9);
	}

	@Override
	Beverage createBeverage() {
		
		return new Beverage();
		
	}

}
