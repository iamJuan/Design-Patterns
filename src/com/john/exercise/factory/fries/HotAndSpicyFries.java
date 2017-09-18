package com.john.exercise.factory.fries;

public class HotAndSpicyFries implements Fries{

	private String size;
	
	public HotAndSpicyFries(String size){
		this.size = size;
	}

	@Override
	public String getSize() {
		return size;
	}

	@Override
	public String getName() {
		return "Hot and Spicy Fries";
	}

	@Override
	public float getCost() {
		float price = 3.75f;
		
		if(size.equals("Large"))
			price += 1f;

		else if(size.equals("Medium"))
			price += .75f;

		else if(size.equals("Small"))
			price += .5f;
			
		return price;
	}

}
