package com.john.exercise.factory.fries;

public class BarbecueFries implements Fries{

	private String size;
	
	public BarbecueFries(String size){
		this.size = size;
	}
	
	@Override
	public String getSize() {
		return size;
	}

	@Override
	public String getName() {
		return "Barbecue Fries";
	}

	@Override
	public float getCost() {
		float price = 3.5f;
		
		if(size.equals("Large"))
			price += 1f;

		else if(size.equals("Medium"))
			price += .75f;

		else if(size.equals("Small"))
			price += .5f;
			
		return price;
	}

}
