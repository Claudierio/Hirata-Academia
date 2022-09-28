package br.com.hirataacademia.cadastro.exception;

public class SalaNaoEncontradaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SalaNaoEncontradaException() {
		super("O contador não foi encontrado.");
	}
}
