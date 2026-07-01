package org.core.curso.calculator; // pagina 139

public class Division extends Operation {
	private static final Character OPERATOR = '/';
	private static final Integer ZERO = 0;

	public Division(Integer operator1, Integer operator2) {
		super(operator1, operator2, OPERATOR);

		// soobrescribir un metodo heredado sobre un padre o abuelo y vale en ciertos
		// casos

	}

	@Override
	public void showResult() {
		/*
		 * if(this.getOperator2().equals(ZERO)) {
		 * System.out.println("No es posible dividir por cero!!!"); return null; } else
		 * { return (this.getOperator1() / this.getOperator2()); }
		 */
	}

	@Override
	public Integer getCalculation() throws ArithmeticException {

		/*
		 * // no geters ni sters por que no hay atributos, tampoco to strings por lo
		 * mismo // hard core debe evitarse por mucha deuda tecnica if
		 * (this.getOperator2().equals(ZERO)) {
		 * System.out.println("No es posible dividir por cero!!!"); return null; // o
		 * lanzar una excepción }
		 * 
		 * // alternativa 2 dejar que ocurra la division pr cero // y captura la
		 * ecpecion en el mismo bloque donde se produce
		 * 
		 * // try lo que habriamos hecho sin ecpecion, es el bloque de instrucciones de
		 * produce el problema y catch capturar // la exepcion si se produce casi como
		 * tener un if else
		 * 
		 * Integer result = null; try { result = (this.getOperator1() /
		 * this.getOperator2());
		 * System.out.println("Si no salta el catch pasa por aqui"); } catch (Exception
		 * e) { e.printStackTrace();
		 * System.out.println("Si salta el catch pasa por aqui y continua el metodo"); }
		 * System.out.println("pasa por aqui tanto ti salta el catch como no"); return
		 * result;
		 * 
		 * } }
		 */
		return (this.getOperator1() / this.getOperator2());
	}
}

// 4 grandes expeciones error no la de a ladoesquema
