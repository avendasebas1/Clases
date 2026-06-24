package org.core.curso.device;

public class Computer extends Device{
	
	private String processor;
	
	public Computer (String name, String brand, float price, String processor) {
		super();
		this.processor = processor;
	}

	public Computer() {
		super();
		this.processor = "Lenovo";
	}


	public String getProcessor() {
		return processor;
	}


	public void setProcessor(String processor) {
		this.processor = processor;
	}


	@Override
	public String toString() {
		return "Computer [processor=" + processor + ", getName()=" + getName() + ", getBrand()=" + getBrand()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
	
	

}
