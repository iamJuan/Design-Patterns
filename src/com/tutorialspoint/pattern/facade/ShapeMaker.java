package com.tutorialspoint.pattern.facade;

public class ShapeMaker {
	private Oval oval;
	private Triangle triangle;
	private Trapezoid trapezoid;
	
	public ShapeMaker(){
		oval = new Oval();
		triangle = new Triangle();
		trapezoid = new Trapezoid();
	}
	
	public void drawOval(){
		oval.draw();
	}
	
	public void drawTriangle(){
		triangle.draw();
	}
	
	public void drawTrapezoid(){
		trapezoid.draw();
	}
}
