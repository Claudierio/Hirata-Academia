package br.com.hirataacademia.fachada.exceptions;

public class ObesidadeMorbidaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObesidadeMorbidaException() {
		super("Lamentamos informar que você não está apto a esta modalidade");
	}
}
