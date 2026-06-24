package org.core.curso.war;

import java.util.Random;

public abstract class Unit {
	
	private String division;
    private String name;
    
    final Random rnd = new Random();
    
    public int fire() {
        return rnd.nextInt(31);
    }

    public int move() {
        return rnd.nextInt(21);
    }
    public Unit(String division, String name) {
    	super();
    	this.division = division;
    	this.name = name;
    }
	
    public Unit() {
		super();
	}


	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Unit [division=" + division + ", name=" + name + ", getDivision()=" + getDivision() + ", getName()="
				+ getName() + ", toString()=" + super.toString() + "]";
	}

    
}
