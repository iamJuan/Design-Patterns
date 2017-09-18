package com.john.exercise.factory.fries;

public class FriesFactoryTest {
	public static void main(String args[]){
		FriesFactory friesFactory = new FriesFactory();
		
		Fries cheeze = friesFactory.getFries("Cheeze", "Large");
		System.out.println(cheeze.getSize()+" "+cheeze.getName() + ":\t$" +cheeze.getCost());
		
		Fries cheeze2 = friesFactory.getFries("Cheeze", "Small");
		System.out.println(cheeze2.getSize()+" "+cheeze2.getName() + ":\t$" +cheeze2.getCost());
		
		Fries bbq = friesFactory.getFries("BBQ", "Medium");
		System.out.println(bbq.getSize()+" "+bbq.getName() + ":\t$" +bbq.getCost());
		
		Fries bbq2 = friesFactory.getFries("BBQ", "Large");
		System.out.println(bbq2.getSize()+" "+bbq2.getName() + ":\t$" +bbq2.getCost());
		
		Fries spicy = friesFactory.getFries("Spicy", "Small");
		System.out.println(spicy.getSize()+" "+spicy.getName() + ":\t$" +spicy.getCost());
		
		Fries spicy2 = friesFactory.getFries("Spicy", "Medium");
		System.out.println(spicy2.getSize()+" "+spicy2.getName() + ":\t$" +spicy2.getCost());
	}
}
