package org.core.curso.geometry;

public class Circle extends Polygon {
	
	private double radius;
	

	@Override
	public double calculatePerimeter() {
	    return 2 * 3.14 * radius;
	}

	@Override
	public double calculateArea() {
	    return 3.14 * radius * radius;
	}
	
	public Circle(String measure, double radius) {
		super(measure);
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", calculatePerimeter()=" + calculatePerimeter() + ", calculateArea()="
				+ calculateArea() + ", getRadius()=" + getRadius() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
