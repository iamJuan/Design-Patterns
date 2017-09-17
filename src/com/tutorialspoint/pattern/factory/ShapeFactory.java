package com.tutorialspoint.pattern.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("RECTANGLE"))	{
			return new Rectangle();
		}

		if(shapeType.equalsIgnoreCase("SQUARE"))	{
			return new Square();
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE"))	{
			return new Circle();
		}
		
		return null;
	}
}
