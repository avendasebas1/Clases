package org.core.curso.calculator;

public abstract class Operation {
	private Integer operator1;
	private Integer operator2;
	private Character operation;
	
	
	public Operation(Integer operator1, Integer operator2, Character operation) {
		super();
		this.operator1 = operator1;
		this.operator2 = operator2;
		this.operation = operation;
	}
	
	// metodo abstracto que oblige a los hijos a ahcer el calculo
	// y a devolver el resultado.
	
	public abstract Integer getCalculation();
	
		public void showResult() {
		System.out.println("El resultado de la operacion" + this.getOperation()
		
		+ " de " + this.getOperator1()
		+ " y " + this.getOperator2()
		+ "  es " + this.getCalculation());
		}
		
	public Integer getOperator1() {
		return operator1;
	}


	public void setOperator1(Integer operator1) {
		this.operator1 = operator1;
	}


	public Integer getOperator2() {
		return operator2;
	}


	public void setOperator2(Integer operator2) {
		this.operator2 = operator2;
	}


	public Character getOperation() {
		return operation;
	}


	public void setOperation(Character operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Operation [getOperator1()=" + getOperator1() + ", getOperator2()=" + getOperator2()
				+ ", getOperation()=" + getOperation() + ", toString()=" + super.toString() + "]";
	}


}
