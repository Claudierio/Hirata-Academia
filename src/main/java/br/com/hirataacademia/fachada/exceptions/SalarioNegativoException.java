package br.com.hirataacademia.fachada.exceptions;

public class SalarioNegativoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public SalarioNegativoException() {
		super("O salário é inválido.");
	}
}
