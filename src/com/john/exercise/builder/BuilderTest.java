package com.john.exercise.builder;

public class BuilderTest {
	public static void main(String args[]){
		CakeBuilder cakeBuilder = new CakeBuilder();
		
		Cake expensiveCake = cakeBuilder.makeExpensiveCake();
		System.out.println("An Expensive Cake $"+expensiveCake.getCost());
		expensiveCake.showItems();
		System.out.println();
		
		Cake budgetCake = cakeBuilder.makeBudgetCake();
		System.out.println("A Budget Cake $"+budgetCake.getCost());
		budgetCake.showItems();
		System.out.println();
		
		Cake cheapCake = cakeBuilder.makeCheapCake();
		System.out.println("A Cheap Cake $"+cheapCake.getCost());
		cheapCake.showItems();
	}
}
