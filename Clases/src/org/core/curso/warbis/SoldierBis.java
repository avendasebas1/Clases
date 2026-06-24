package org.core.curso.warbis;

public class SoldierBis extends UnitBis {
	
	private String rank;
	private int age;

	public void prone () {
		// Metodo no contructores por comidad - privados + publicos * protegidos
		System.out.println(this.getRank() + ": Cubrirse!!!!");
	}




	public SoldierBis(String division, String name, int armor, int ammo, String rank, int age) {
		super(division, name, armor, ammo);
		this.rank = rank;
		this.age = age;
	}
	
	
	
	
	public String getRank() {
		return rank;
	}




	public void setRank(String rank) {
		this.rank = rank;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "SoldierBis [getRank()=" + getRank() + ", getAge()=" + getAge() + ", getDivision()=" + getDivision()
				+ ", getName()=" + getName() + ", getArmor()=" + getArmor() + ", getAmmo()=" + getAmmo() + "]";
	}
	
	
	
	
}
