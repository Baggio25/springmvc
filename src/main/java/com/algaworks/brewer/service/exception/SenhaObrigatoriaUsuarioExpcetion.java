package com.algaworks.brewer.service.exception;

public class SenhaObrigatoriaUsuarioExpcetion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SenhaObrigatoriaUsuarioExpcetion(String msg) {
		super(msg);
	}
}
