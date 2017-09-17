package com.tutorialspoint.pattern.bridge;

public class BridgePatternDemo {
	public static void main(String args[]){
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape grnCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		grnCircle.draw();
	}
}
