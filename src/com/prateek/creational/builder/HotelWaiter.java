package com.prateek.creational.builder;

public class HotelWaiter {
	
	public static Beverage takeOrder(String beverageType){
		
		BeverageBuilder beverageBuilder=null;
		
		if(beverageType.equalsIgnoreCase("tea")){
			
			beverageBuilder= new TeaBuilder();
		}else if (beverageType.equalsIgnoreCase("Coffee")) {
			beverageBuilder=new CoffeeBuilder();
		}else{
			System.out.println("Sorry we could not take order for "+beverageType);
		}
		return beverageBuilder.buildBeverage();
	}

}
