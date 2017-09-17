package com.john.exercise.adapter;

public class BluetoothEnabledSpeaker implements Bluetooth{
	Speaker speaker;
	
	public BluetoothEnabledSpeaker(Speaker speaker){
		this.speaker = speaker;
	}
	
	@Override
	public void connects(){
		speaker.playSound();
	}
}
