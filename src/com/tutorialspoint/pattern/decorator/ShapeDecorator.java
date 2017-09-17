package com.tutorialspoint.pattern.decorator;

public abstract class ShapeDecorator implements Shape{
	public Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}
	
	@Override
	public abstract void draw();
}
