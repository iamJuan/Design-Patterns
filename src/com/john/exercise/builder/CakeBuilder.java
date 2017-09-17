package com.john.exercise.builder;

public class CakeBuilder {
	
	public Cake makeExpensiveCake(){
		Cake cake = new Cake();
		cake.addons(new SugarCoating());
		cake.addons(new EdibleGlitter());
		cake.addons(new SparkingCandle());
		
		return cake;
	}
	
	public Cake makeBudgetCake(){
		Cake cake = new Cake();
		cake.addons(new ThinCoating());
		cake.addons(new EdibleGlitter());
		cake.addons(new RegularCandle());
		
		return cake;
	}
	
	public Cake makeCheapCake(){
		Cake cake = new Cake();
		cake.addons(new ThinCoating());
		cake.addons(new SprinklesDecor());
		cake.addons(new RegularCandle());
		
		return cake;
	}
}
