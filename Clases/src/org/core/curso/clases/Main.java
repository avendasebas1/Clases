package org.core.curso.clases;

public class Main {

	public static void main(String[] args) {
		System.out.println("START PROGRAM");
		
		//test1();
		//test2();
		//test3();
		test4();
		
		System.out.println("END PROGRAM");

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
