
package org.core.curso.clases;

import java.util.Objects;

public class Persona extends Object {

	private String nombre;
	protected int edad;
	private String password;
	
	public void mostrar() {
		System.out.println("Ficha de la persona:");
		System.out.println("--------------------");
		System.out.println("\tNombre: " + getNombre());
		System.out.println("\tEdad: " + getEdad());
		// System.out.println("\tPassword: " + password);
		System.out.println("\tPassword: " + getPassword());
	}

	public Persona() {
		super();
		this.nombre = "Juan Sinnombre";
		this.edad = 18;
		this.password = "to be modified";
	}

	public Persona(String nuevoNombre) {
		this.nombre = nuevoNombre;
		edad = 0;
		this.password = "to be modified";
	}

	public Persona(String nombre, int edad, String password) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.password = password;

	}

	public Persona(int edad) {
		super();
		this.edad = edad;
		this.nombre = "Jhon Doe";
		this.password = "to be modified";

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", password=" + getPassword() 
		+ " ]" + super.toString() + "]";

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPassword() {
		// return password;
		return "******";
	}

	public void setPassword(String password) {
		// this.password = password;
		System.out.println("Para cambiar la password hable con el administrador");
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(edad), nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad 
		        && nombre.equalsIgnoreCase(other.nombre)
		        && Objects.equals(password, other.password);
	}
}
