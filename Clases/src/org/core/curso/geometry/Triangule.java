package org.core.curso.geometry;

public class Triangule extends Polygon{ 

	private int side;

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (side + side + side);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (side * side) / 2;
		
	}

	public Triangule(String measure, int side) {
		super(measure);
		this.side = side;
	}

	public Triangule(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Triangule [side=" + side + ", calculatePerimeter()=" + calculatePerimeter() + ", calculateArea()="
				+ calculateArea() + ", getSide()=" + getSide() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
