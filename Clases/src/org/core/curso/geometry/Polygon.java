package org.core.curso.geometry;

public abstract class Polygon extends Shape {

	// resto metodos
	public abstract double calculatePerimeter();
	
	public abstract double calculateArea();

	//constructores
	
	public Polygon(String measure) {
		super(measure);
	}

	public Polygon() {
		super();
	}
	
	
	
}
