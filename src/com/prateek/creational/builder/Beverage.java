package com.prateek.creational.builder;

public class Beverage {
	
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	public int getSuger() {
		return suger;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public int getPowderQuantity() {
		return powderQuantity;
	}
	public void setPowderQuantity(int powderQuantity) {
		this.powderQuantity = powderQuantity;
	}
	public String getBreverageName() {
		return breverageName;
	}
	public void setBreverageName(String breverageName) {
		this.breverageName = breverageName;
	}
	
	
	private int water;
	private int milk;
	private int suger;
	private int powderQuantity;
	private String breverageName;
	
	public String toString(){
		
		return "Hot " + breverageName + "!!!!  [" + water + " ml of water, " + milk + "ml of milk, " + suger
                + " gm of sugar, " + powderQuantity + " gm of " + breverageName + "]\n";
	}

}
