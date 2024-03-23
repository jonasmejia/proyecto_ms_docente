package com.anfic.rest.app_proyectos.exception;

/*
 * Excepcion que se lanza cuando se realiza una operación ilegal
 */
public class IllegalOperationException extends Exception {
	private static final long serialVersionUID = 1L;
	 
	public IllegalOperationException(String message) {
		super (message);
	}
}
