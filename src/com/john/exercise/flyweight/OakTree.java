package com.john.exercise.flyweight;

public class OakTree implements Tree{
	
	public int height;
	public int x_pos;
	public int y_pos;
	
	public void setXPos(int x_pos){
		this.x_pos = x_pos;
	}
	
	public void setYPos(int y_pos){
		this.y_pos = y_pos;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	@Override
	public void sprout() {
		System.out.println("A "+height+"ft. Oak tree sprouted at coordinates ["+x_pos+","+y_pos+"].");
	}

}
