package com.john.exercise.builder;

import java.util.ArrayList;
import java.util.List;

public class Cake {
	private List<Addons> addons = new ArrayList<Addons>();
	
	public void addons(Addons addon){
		addons.add(addon);
	}
	
	public float getCost(){
		float cost = 0.0f;
		
		for(Addons addon:addons){
			cost += addon.price();
		}
		
		return cost;
	}
	
	public void showItems(){
		for(Addons addon:addons){
			System.out.print(" Addon : "+addon.name());
			System.out.println(", Price : "+addon.price());
		}
	}
}
