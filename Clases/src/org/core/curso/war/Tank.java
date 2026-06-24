package org.core.curso.war;

public class Tank extends Unit {
	
	// no puedo declarar atributos private dentro de un metodo
	public String model;
	private int ammo; 
	private int armor;

	public void turn() {
		// Metodo
		System.out.println(this.getModel() + "Recarga");		
	}		

	public Tank(String division, String name, String model, int ammo, int armor) {
		super(division, name);
		this.model = model;
		this.ammo = ammo;
		this.armor = armor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	@Override
	public String toString() {
		return "Tank [getModel()=" + getModel() + ", getAmmo()=" + getAmmo() + ", getArmor()=" + getArmor()
				+ ", getDivision()=" + getDivision() + ", getName()=" + getName() + "]";
	}


	
}
