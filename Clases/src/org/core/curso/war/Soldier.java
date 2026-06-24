package org.core.curso.war;

public class Soldier extends Unit {
	
	private String rank;
	private int age;
	
	public void prone () {
		// Metodo
		System.out.println(this.getRank() + "Cubrirse.");
	}

	public Soldier(String division, String name, String rank, int age) {
		super(division, name);
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
		return "Soldier [rank=" + rank + ", age=" + age + ", getRank()=" + getRank() + ", getAge()=" + getAge()
				+ ", getDivision()=" + getDivision() + ", getName()=" + getName() + "]";
	}

	
}
