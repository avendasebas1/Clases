package org.core.curso.device;

public class Laptop extends Device {

	private String SerialNumber;
	
	public Laptop(String name, String brand, Float price, String serialNumber) {
		super(name, brand, price);
		SerialNumber = serialNumber;
	}

	public Laptop() {
		super();
		this.SerialNumber ="TBD" ;
	}

	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Laptop [SerialNumber=" + SerialNumber + ", getSerialNumber()=" + getSerialNumber() + ", getName()="
				+ getName() + ", getBrand()=" + getBrand() + ", getPrice()=" + getPrice() + "]";
	}
	
	

}