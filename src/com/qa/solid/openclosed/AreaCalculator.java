package com.qa.solid.openclosed;

public class AreaCalculator {

//	public double calculateAreaRectangle(Rectangle rect) {
//		return rect.getLength() * rect.getWidth();
//	}
//	
//	public double calculateAreaCircle(Circle circle) {
//		return circle.getRadius() * circle.getRadius() * Math.PI;
//	}
	
	public double calculateShapeArea(Shape shape) {
		return shape.calculateArea();
	}
}
