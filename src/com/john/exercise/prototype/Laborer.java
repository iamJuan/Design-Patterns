package com.john.exercise.prototype;

public class Laborer extends Employee{

	public Laborer(){
		type = "Laborer";
	}
	
	@Override
	public void display(){
		System.out.println("Hi I do all the hard works. :(");
	}
}
