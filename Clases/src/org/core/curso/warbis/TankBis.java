package org.core.curso.warbis;

public class TankBis extends UnitBis {
	
	// no puedo declarar atributos private dentro de un metodo
	public String model;

	public void turn() {
		// Metodo
		System.out.println(this.getModel() + "Recarga");		
	}		

	public TankBis(String division, String name, String model, int ammo, int armor) {
		super(division, name, ammo, armor);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override // cogemos los gets del padre unit y solo model de tank
	public String toString() {
		return "TankBis [getModel()=" + getModel() + ", getDivision()=" + getDivision() + ", getName()=" + getName()
				+ ", getArmor()=" + getArmor() + ", getAmmo()=" + getAmmo() + "]";
	}
	
	

	
}
