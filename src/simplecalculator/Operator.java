/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

/**
 *
 * @author user
 */
public enum Operator {

	ADD("+"), SUB("-"), MULT("*"), DIV("/");

	private final String symbol;

	private Operator(String newSymbol) {
		symbol = newSymbol;
	}

	public String getSymbol() {
		return symbol;
	}

}
