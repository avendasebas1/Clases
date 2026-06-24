package org.core.curso.device;

// estructura 1: Padre 2: atributos 3: Constructor(es) 4: getters (stters) 5: to string (m hace falta 6: resto metodos

public abstract class Device extends Object {
	
	private String name;
	private String brand;
	private Float price;
	
	
	
	public Device(String name, String brand, Float price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	
	
	public Device() {
		super();
		this.name = "LG";
		this.brand = "SAMSUNG";
		this.price = 100.00f;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		price = price;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	
}
