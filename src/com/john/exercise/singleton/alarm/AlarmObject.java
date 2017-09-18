package com.john.exercise.singleton.alarm;

public class AlarmObject {
	private static AlarmObject instance = new AlarmObject();

	public AlarmObject(){}
	
	public static AlarmObject getInstance(){
		return instance;
	}
	
	public void ringTheAlarm(){
		System.out.println("RIIIIIIIIIIIINNNNNNNNNNNNNGGGGGGGG!!!!");
	}
}
