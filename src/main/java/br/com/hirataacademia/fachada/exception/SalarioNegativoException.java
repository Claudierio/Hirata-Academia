package br.com.hirataacademia.fachada.exception;

public class SalarioNegativoException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public SalarioNegativoException() {
		super("O salário é inválido");
	}
}
