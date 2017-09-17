package com.tutorialspoint.pattern.bridge;

public class Circle extends Shape{
	
	private int x = 0;
	private int y = 0;
	private int r = 0;
	
	public Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.r = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(r, x, y);
	}

}
