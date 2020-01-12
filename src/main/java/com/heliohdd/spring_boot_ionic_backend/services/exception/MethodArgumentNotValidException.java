package com.heliohdd.spring_boot_ionic_backend.services.exception;

public class MethodArgumentNotValidException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MethodArgumentNotValidException(String msg) {
		super(msg);
	}

	public MethodArgumentNotValidException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public MethodArgumentNotValidException getBindingResult() {		//	Analisar necessidade
		return null;
	}

	public Object getFieldErrors() {
		// TODO Auto-generated method stub
		return null;
	}

}