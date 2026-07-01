package org.core.curso.calculator;

public class Subtract extends Operation {

private static final Character OPERATOR = '+';

public Subtract (Integer operator1, Integer operator2) {
	super(operator1, operator2, OPERATOR);
}

@Override
public Integer getCalculation() {
	return (this.getOperator1() - this.getOperator2());
}

}

// no geters ni sters por que no hay atributos, tampoco to strings por lo mismo
// hard core debe evitarse por mucha deuda tecnica