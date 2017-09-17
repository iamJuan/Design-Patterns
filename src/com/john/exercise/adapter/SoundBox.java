package com.john.exercise.adapter;

public class SoundBox implements Speaker{
	@Override
	public void playSound(){
		System.out.println(" is producing sound...");
	}
}
