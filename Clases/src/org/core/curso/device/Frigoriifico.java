package org.core.curso.device;

public class Frigoriifico extends Device{
	
	private String processor;
	

	public Frigoriifico(String name, String brand, float price, String processor) {
		super(name,brand,price);
		this.processor = processor;
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
