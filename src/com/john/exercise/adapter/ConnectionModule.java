package com.john.exercise.adapter;

public class ConnectionModule implements Bluetooth{
	@Override
	public void connects(){
		System.out.println(" is connecting...");
	}
}
