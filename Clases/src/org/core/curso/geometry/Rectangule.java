package org.core.curso.geometry;

public class Rectangule extends Polygon {
	

	private int width;
	private int height;
	
	
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
	    return 2 * (width + height);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
	    return (width * height);
	}

	public Rectangule(String measure, int width, int height) {
		super(measure);
		this.width = width;
		this.height = height;
	}

	public Rectangule(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangule [width=" + width + ", height=" + height + ", calculatePerimeter()=" + calculatePerimeter()
				+ ", calculateArea()=" + calculateArea() + ", getWidth()=" + getWidth() + ", getHeight()=" + getHeight()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}