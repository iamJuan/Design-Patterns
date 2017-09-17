package com.john.exercise.prototype;

public class SafetyOfficer extends Employee{

	public SafetyOfficer(){
		type = "Safety Officer";
	}
	
	@Override
	public void display() {
		System.out.println("Hi I'm keeping all the employees safe.");		
	}

}
