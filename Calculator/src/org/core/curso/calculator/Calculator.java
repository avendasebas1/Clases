package org.core.curso.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
	private List<Operation> operationArrayList = new ArrayList<Operation>();
	Scanner keyboard = new Scanner(System.in);
	private final String VALID_OPTIONS = "+-*/";
	private final String REGEX_VALID_OPTIONS_OPERATOR = "^[+*/-]$";
	private final String REGEX_VALID_OPTIONS_NUMBERS = "^[+-]?\\d+$";

	private void dataTest() {
		this.getOperationArrayList().add(new Sum(2, 3));
		this.getOperationArrayList().add(new Subtract(7, 5));
		this.getOperationArrayList().add(new Multiply(4, 6));
		this.getOperationArrayList().add(new Division(10, 2));
		this.getOperationArrayList().add(new Division(5, 0));

	}

	public void showOperationArrayListHistory() {
		if (this.getOperationArrayList().size() > 0) {
			System.out.println("Hay " + this.getOperationArrayList().size() + " operationes en el Hisotrio");
			for (Operation item : this.getOperationArrayList()) {
				System.out.println(item.toString());
			}

		} else {
			System.out.println("El Historico esta Vacio");
		}
	}

	private void init() {
		this.dataTest();
		menu();
	}

	private void menu() {
		int option = getMenuOption();
		do {
		paintMenu();
		switch (option) {
		case 1:
			newOperation();
			break;
		case 2:
			showOperationArrayListHistory();
			break;
		default:
			System.out.println("has decidido finalizar");
		}		
		}while ((option >= 1) && (option <= 2));

		keyboard.close();
	}

	private void newOperation() {
		char operator = getOperator();
		int operando1 = getoperando();
		int operando2 = getoperando();
		System.out.println("Nueva operacion: " + operator +
		        " con " + operando1 + " y " + operando2);
		
		switch (oeprator) {
		case '+':
			this.getOperationArrayList(new Sum(Operando1, operando2));
			break;
		case '-':
			this.getOperationArrayList(new Substract(Operando1, operando2));
			break;
		case '*':
			this.getOperationArrayList(new Multiply(Operando1, operando2));
			break;
		case '/':
			this.getOperationArrayList(new Division(Operando1, operando2));
			break;
	default:
		System.out.println("Operacion no permitida !!!");
				break:
		}
	}

	private int getoperando() {
		String number;
		do {
			System.out.println("introduce un numero entero: ");
			number = this.keyboard.next();
			System.out.println("has tecleado: " + number);
		} while (!number.matches(this.REGEX_VALID_OPTIONS_NUMBERS));
		System.out.println("\tTRAZA: numero validado validad: " + number);
		return Integer.valueOf(number);
	}

	private char getOperator() {

		// laternativa3
		String operation;
		do {
			System.out.println("Primero eliga la oprecion: " + this.VALID_OPTIONS);
			operation = this.keyboard.next();
			System.out.println("has elegido la operacion: " + operation);
		} while (!operation.matches(this.REGEX_VALID_OPTIONS_OPERATOR));
		System.out.println("TRAZA: opcion validada: " + operation.charAt(0));
		return operation.charAt(0);

	}
	// Alternativa1

	/*
	 * String operation; do {
	 * System.out.println("Primero eliga la oprecion (+, -, *, /):"); operation =
	 * this.keyboard.next(); System.out.println("has elegido la operacion: " +
	 * operation); } while ( (operation.length() > 1 || ( (operation.length() == 1)
	 * && (!((operation.charAt(0) == '+' ) || (operation.charAt(0)
	 * (operation.charAt(0) == '*') || (operation.charAt(0) == '/')))) );
	 * System.out.println("TRAZA: opcion validad: " + operation.charAt(0));
	 */
// alternativa 2		
	/*
	 * String operation; { do { System.out.println("Primero eliga la oprecion" +
	 * this.VALID_OPTIONS); operation = this.keyboard.next();
	 * System.out.println("has elegido la operacion: " + operation); } while (
	 * (operation.length() > 1) || ( (operation.length() == 1) &&
	 * (!this.VALID_OPTIONS.contains(operation))) );
	 * System.out.println("TRAZA: opcion validad: " + operation.charAt(0)); return
	 * operation.charAt(0); }
	 */

	private int getMenuOption() {
		System.out.println("introduzca su ocpion: ");
		return keyboard.nextInt();
	}

	private void paintMenu() {

		System.out.println("Menu de Opciones");
		System.out.println("----------------------");
		System.out.println("1) Nueva Operacion");
		System.out.println("2) Mostrar historico de operaciones");
		System.out.println("otro numero) Finalizar");
	}

	public Calculator() {
		super();
		init();

	}

	public List<Operation> getOperationArrayList() {
		return operationArrayList;
	}

	public void setOperationArrayList(List<Operation> operationArrayList) {
		this.operationArrayList = operationArrayList;
	}

	@Override
	public String toString() {
		return "Calculator [getOperationArrayList()=" + getOperationArrayList() + ", toString()=" + super.toString()
				+ "]";
	}

}