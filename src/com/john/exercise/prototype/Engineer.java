package com.john.exercise.prototype;

public class Engineer extends Employee{

	public Engineer(){
		type = "Engineer";
	}
	
	@Override
	public void display() {
		System.out.println("Hi I can build a house.");
	}

}
