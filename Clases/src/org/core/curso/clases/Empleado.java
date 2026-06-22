package org.core.curso.clases;

public class Empleado extends Persona {
	private double sueldoBruto;
	
	
	
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
		System.out.println("\tSueldo bruto: " + this.getSueldoBruto());
		
		public void calcularSueldoNeto() {
			//double sueldoNeto = this.getSueldoBruto() * 0.80;
			//System.out.println("Sueldo neto: " + sueldoNeto);
			System.out.println("Sueldo neto: " + this.getSueldoBruto() * 0.80));
		}
		
	}

	public Empleado(String nombre, int edad, String password, double sueldoBruto) {
		super(nombre, edad, password);
		this.sueldoBruto = 0;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	

}
