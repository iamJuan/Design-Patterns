package com.john.exercise.factory;

public class FactoryTest {
	public static void main(String args[]){
		DogFactory dogFactory = new DogFactory();
		
		Dog shiba = dogFactory.getDog("Shiba");
		shiba.bark();
		
		Dog germanShepherd = dogFactory.getDog("German Shepherd");
		germanShepherd.bark();
		
		Dog siberianHusky = dogFactory.getDog("Siberian Husky");
		siberianHusky.bark();
	}
}
