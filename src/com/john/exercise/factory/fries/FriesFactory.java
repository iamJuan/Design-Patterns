package com.john.exercise.factory.fries;

public class FriesFactory {
	public Fries getFries(String flavor, String size){
		Fries fries = null;
		
		if(flavor.equals("Cheeze"))
			fries = new CheezyFries(size);
		else if(flavor.equals("BBQ"))
			fries = new BarbecueFries(size);
		else if(flavor.equals("Spicy"))
			fries = new HotAndSpicyFries(size);
		
		return fries;
	}
}
