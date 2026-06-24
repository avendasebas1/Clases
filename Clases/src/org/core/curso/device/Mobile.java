package org.core.curso.device;

public class Mobile extends Device {
	
	private String number;
	
	public void call () {
	System.out.println("Llamando al numero" + this.getNumber());
	
	}

	public Mobile(String name, String brand, float price, String number) {
		super();
		this.number = number;
	}

	public Mobile() {
		super();
		this.number = "1012942";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Mobile [getNumber()=" + getNumber() + ", getName()=" + getName() + ", getBrand()=" + getBrand()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
	
}
