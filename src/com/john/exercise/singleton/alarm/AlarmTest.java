package com.john.exercise.singleton.alarm;

public class AlarmTest {
	public static void main(String args[]){
		
		AlarmObject alarmObject = AlarmObject.getInstance();
		alarmObject.ringTheAlarm();
		alarmObject.ringTheAlarm();
		alarmObject.ringTheAlarm();
	}
}
