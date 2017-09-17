package com.john.exercise.adapter;

public class AdapterTest {
	public static void main(String args[]){
		
		SoundBox sbox = new SoundBox();
		ConnectionModule connCard = new ConnectionModule();
		BluetoothEnabledSpeaker bluetoothSpeaker = new BluetoothEnabledSpeaker(sbox);
		
		System.out.print("Speaker");
		sbox.playSound();
		
		System.out.print("Connection Module");
		connCard.connects();

		System.out.print("Bluetooth Speaker connects and");
		bluetoothSpeaker.connects();
	}
}
