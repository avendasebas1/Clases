package org.core.curso.geometry;

public class Square extends Polygon {

	private int side;

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (side * 4);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (side * side);
	}

	public Square(String measure, int side) {
		super(measure);
		this.side = side;
	}

	public Square(int side) {
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
		return "Square [getSide()=" + getSide() + ", getMeasure()=" + getMeasure() + ", toString()=" + super.toString()
				+ "]";
	}
}
