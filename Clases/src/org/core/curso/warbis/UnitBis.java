package org.core.curso.warbis;

import java.util.Random;

public abstract class UnitBis {

	private String division;
	private String name;
	private int armor;
	private int ammo;
	
	final Random random = new Random();

	// Resto de metodos (no contructores, no G&S)
	public int fire() {
		int ammunition = random.nextInt(15);
		if (ammunition >= this.getAmmo()) {
			return this.getAmmo ();
		}
		else {
			return ammunition;
		}
	}

	public int move() {
		return random.nextInt(30);
	}
	// CONSTRUCTOR

	public String getDivision() {
		return division;
	}

	public UnitBis(String division, String name, int armor, int ammo) {
		super();
		this.division = division;
		this.name = name;
		this.armor = armor;
		this.ammo = ammo;
	}	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	@Override // preferimos los get methods
	public String toString() {
		return "UnitBis [getDivision()=" + getDivision() + ", getName()=" + getName() + ", getArmor()=" + getArmor()
				+ ", getAmmo()=" + getAmmo() + "]";
	}
	
	
	
}
