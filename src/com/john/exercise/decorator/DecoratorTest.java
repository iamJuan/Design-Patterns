package com.john.exercise.decorator;

public class DecoratorTest {
	public static void main(String args[]){
		
		Drink coffee = new Coffee();
		System.out.println(coffee.name() + ": $"+coffee.getCost());
		
		coffee = new Creamer(coffee);
		System.out.println("+"+coffee.name() + ": $"+coffee.getCost());
		
		coffee = new Sugar(coffee);
		System.out.println("+"+coffee.name() + ": $"+coffee.getCost());
		
		coffee = new Frappe(coffee);
		System.out.println("+"+coffee.name() + ": $"+coffee.getCost());
		
		System.out.println();
		
		Drink capp = new Cappucino();
		System.out.println(capp.name() + ": $"+capp.getCost());
		
		capp = new Frappe(capp);
		System.out.println("+"+capp.name() + ": $"+capp.getCost());
	}
}
