package com.john.exercise.adapter.camera;

public class DeviceStorage implements Storage{
	private Adapter adapter;
	
	public DeviceStorage(Adapter adapter){
		this.adapter = adapter;
	}
	
	@Override
	public void store(){
		adapter.attach();
		System.out.println("Storing data...");
	}
}
