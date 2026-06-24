package org.core.curso.geometry;

public abstract class Shape {
	
	private String measure;
	
	// resto metodos

	// contructores

	public Shape(String measure) {
		super();
		this.measure = measure;
	}

	public Shape() {
		super();
		this.measure = "meters";
		
	// getters & stters	
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}
	
	// to string

	@Override
	public String toString() {
		return "Shape [getMeasure()=" + getMeasure()
		+ ", toString()=" + super.toString()+ "]";
	}
	
	
	
}