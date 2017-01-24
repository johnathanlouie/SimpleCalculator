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
public class UnknownOperatorException extends RuntimeException {

	/**
	 * Creates a new instance of <code>UnknownOperator</code> without detail
	 * message.
	 */
	public UnknownOperatorException() {
	}

	/**
	 * Constructs an instance of <code>UnknownOperator</code> with the specified
	 * detail message.
	 *
	 * @param msg the detail message.
	 */
	public UnknownOperatorException(String msg) {
		super(msg);
	}
}
