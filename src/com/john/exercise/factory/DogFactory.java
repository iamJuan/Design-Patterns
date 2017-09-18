package com.john.exercise.factory;


public class DogFactory {
	
	public Dog getDog(String dogType){
		if(dogType == null)
			return null;
		else if(dogType.equals("German Shepherd"))
			return new GermanShepherd();
		else if(dogType.equals("Shiba"))
			return new Shiba();
		else if(dogType.equals("Siberian Husky"))
			return new SiberianHusky();
		
		return null;
	}
	
}