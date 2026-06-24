package org.core.curso.clases;

import org.core.curso.device.Computer;
import org.core.curso.device.Laptop;
import org.core.curso.device.Mobile;
import org.core.curso.geometry.Circle;
import org.core.curso.geometry.Rectangule;
import org.core.curso.geometry.Square;
import org.core.curso.geometry.Triangule;
import org.core.curso.war.Soldier;
import org.core.curso.war.Tank;
import org.core.curso.warbis.SoldierBis;
import org.core.curso.warbis.TankBis;

public class Main {

	public static void main(String[] args) {
		System.out.println("START PROGRAM");

		// test1();
		// test2();
		// test3();
		// test4();
		// test5();
		// test6();
		// test7();
		// test8();
		// test9();
		// test10();
		test11();

		// ejercicio de la pag 125

		System.out.println("END PROGRAM");

	}

	private static void test11() {
		int spentAmmunition = 0;
		int roundCounter = 1;
		// TODO Auto-generated method stub
		TankBis tank1 = new TankBis("Primera Division", "Leo", "Tiger", 23, 24);
		System.out.println(tank1.toString());
		SoldierBis soldier1 = new SoldierBis("Segunda Division", "Cesar", 24, 24, "Cabo", 18);
		System.out.println(soldier1.toString());

		// Primera ronda
		do {
			// Dispara tank1
			spentAmmunition = tank1.fire();
			tank1.setAmmo(tank1.getAmmo() - spentAmmunition);
			soldier1.setArmor(soldier1.getArmor() - spentAmmunition);
			// Dispara Soldier
			spentAmmunition = soldier1.fire();
			soldier1.setArmor(soldier1.getArmor() - spentAmmunition);
			tank1.setArmor(tank1.getArmor() - spentAmmunition);
			System.out.println("RESULTADO RONDA" + roundCounter); // roundcounter es concadenar
			System.out.println(tank1.toString());
			System.out.println(soldier1.toString());
			//
			roundCounter++; // para que encada ronda valla aumentando
		} while ((tank1.getArmor() >= 0 && soldier1.getArmor() >= 0)
				&& ((tank1.getAmmo() > 0) || (soldier1.getAmmo() > 0)));

		if (((tank1.getAmmo() <= 0) && (soldier1.getAmmo() >= 0))
				|| ((tank1.getArmor() <= 0) && (soldier1.getArmor() <= 0))) {
			System.out.println("LOS DOS HAN PERDIDO!!!");

		} else {
			if (tank1.getArmor() >= 0) {
				System.out.println("Hagamos un funeral por " + soldier1.getName());
				System.out.println("Ganador: " + tank1.getName());
			} else {
				if (soldier1.getArmor() >= 0) {
					System.out.println("Llevemos a la chatarra a " + tank1.getName());
					System.out.println("Ganador: " + soldier1.getName());
				}
			}
		}
	}

	private static void test10() {
		// TODO Auto-generated method stub
		Tank tank1 = new Tank("Primera Division", "Lalo", "Tiger", 30, 30);
		System.out.println(tank1);
		Soldier soldier1 = new Soldier("tercera Division", "Saul", "Cabo", 18);
		System.out.println(soldier1);

	}

	private static void test9() {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle("meters", 5);

		System.out.println(
				"El perimetro de un circulo de radio " + circle1.getRadius() + " es " + circle1.calculatePerimeter());

		System.out.println("El area de un circulo de radio " + circle1.getRadius() + " es " + circle1.calculateArea());

		System.out.println(circle1.toString());
	}

	private static void test8() {
		// TODO Auto-generated method stub
		Rectangule rectangule1 = new Rectangule(3, 2);
		System.out.println("El perimetro de un rectangulo de width " + rectangule1.getWidth() + " y height "
				+ rectangule1.getHeight() + " es " + rectangule1.calculatePerimeter());

		System.out.println("El area de un rectangulo de width " + rectangule1.getWidth() + " y height "
				+ rectangule1.getHeight() + " es " + rectangule1.calculateArea());
		System.out.println(rectangule1.toString());

	}

	private static void test7() {
		Triangule triangule1 = new Triangule(3);
		System.out.println("El perimetro de un triangulo de lado " + triangule1.getSide() + " es "
				+ triangule1.calculatePerimeter());
		System.out.println(
				"El area de un trianuglo de lado " + triangule1.getSide() + " es " + triangule1.calculateArea());
		System.out.println(triangule1.toString());

	}

	private static void test6() {
		// TODO Auto-generated method stub
		Square square1 = new Square(5);
		System.out.println(
				"El perimetro de un cuadrado de lado " + square1.getSide() + " es " + square1.calculatePerimeter());
		System.out.println("El area de un cuadrado de lado " + square1.getSide() + " es " + square1.calculateArea());
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
		/*
		 * si la clase es abstracta esta linea ya no se puede poner (device) ya no la
		 * podemos instansear Device device1 = new Device();
		 * System.out.println(device1.toString()); Device device2 = new Device("F400",
		 * "NEW POL", 375.00f); System.out.println(device2.toString());
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
