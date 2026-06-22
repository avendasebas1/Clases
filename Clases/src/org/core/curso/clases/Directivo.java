package org.core.curso.clases;

public class Directivo extends Empleado {
	private String categoria;

	public Directivo(String nombre, int edad, String password, double sueldoBruto, String categoria) {
		super(nombre, edad, password, sueldoBruto);
		this.categoria = categoria;
	}

	public Directivo() {
		super(); // debe ir siempre en 1era linea
		this.categoria ="Sin categoria definida";
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("\tCategoria:"
				+ this.getCategoria());
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
