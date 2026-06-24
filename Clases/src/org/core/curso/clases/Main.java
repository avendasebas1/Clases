package org.core.curso.clases;

import org.core.curso.device.Computer;
import org.core.curso.device.Device;
import org.core.curso.device.Laptop;
import org.core.curso.device.Mobile;
import org.core.curso.geometry.Rectangule;
import org.core.curso.geometry.Square;
import org.core.curso.geometry.Triangule;

public class Main {

	public static void main(String[] args) {
		System.out.println("START PROGRAM");
		
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		test8();
		// ejercicio de la pag 125
		
		System.out.println("END PROGRAM");

	}

	private static void test8() {
		// TODO Auto-generated method stub
		Rectangule rectangule1 = new Rectangule(1,2);
		System.out.println("El perimetro del rectangulo es " + rectangule1.calculatePerimeter());
		System.out.println("El area del rectangulo es " + rectangule1.calculateArea());
		System.out.println(rectangule1.toString());
	}

	private static void test7() {
		Triangule triangule1 = new Triangule(3);
		System.out.println("El perimetro de un triangulo de lado " + triangule1.getSide() +
				" es " + triangule1.calculatePerimeter());
		System.out.println("El area de un trianuglo de lado " + triangule1.getSide() +
				" es " + triangule1.calculateArea());
		System.out.println(triangule1.toString());
		
		
	}

	private static void test6() {
		// TODO Auto-generated method stub
		Square square1 = new Square(5);
		System.out.println("El perimetro de un cuadrado de lado " + square1.getSide() +
				" es " + square1.calculatePerimeter());
		System.out.println("El area de un cuadrado de lado " + square1.getSide() +
				" es " + square1.calculateArea());
		System.out.println(square1.toString());
	}

	private static void test5() {
		// TODO Auto-generated method stub
		Mobile mobile1 = new Mobile();
		Mobile mobile2 = new Mobile("3310", "Nokia", 100.00f, "1241242");
		mobile1.call();
		mobile1.toString();
		mobile2.call();
		mobile2.toString();
		//
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("4511", "NIPOGI", 300.00f, "intel");
		System.out.println(computer1.toString());
		System.out.println(computer2.toString());
		//
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop("765", "HP", 400.50f, "AMD");
		System.out.println(laptop1.toString());
		System.out.println(laptop2.toString());
		/* si la clase es abstracta esta linea ya no se puede poner (device) ya no la podemos instansear
		Device device1 = new Device();
		System.out.println(device1.toString());
		Device device2 = new Device("F400", "NEW POL", 375.00f);
		System.out.println(device2.toString());
		*/
	}

	private static void test4() {
		// TODO Auto-generated method stub
		Directivo directivo1 = new Directivo();
		Directivo directivo2 = new Directivo("Sergio", 25, "werrwer", 50000.12, "Encargado");
		directivo1.mostrar();
		directivo1.calcularSueldoNeto();
		directivo2.mostrar();
		directivo2.calcularSueldoNeto();
	}

	private static void test3() {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado("Luis", 24, "adadas", 40000.50);
		empleado1.mostrar();
		empleado1.calcularSueldoNeto();
		empleado2.mostrar();
		empleado2.calcularSueldoNeto();
		
	}

	private static void test2() {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente("Elena", 23, "1234", "1235321");
		cliente1.mostrar();
		cliente2.mostrar();
	}

	public static void test1() {
		Persona persona1 = new Persona("Jose Gonzales", 51, "JOSE");
		Persona persona2 = new Persona("Juan Perez", 35, "JUAN");
		Persona persona3 = new Persona("Ana Sanz");
		Persona persona4 = new Persona(27);
		Persona persona5 = new Persona();
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		System.out.println(persona4.toString());
		System.out.println(persona5.toString());
		
		System.out.println();
		persona1.setPassword("otra password");
		System.out.println(persona1.toString());

		System.out.println("la password es: " + persona1.getPassword());
		
		persona1.mostrar();
	}

}
