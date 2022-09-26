package br.com.hirataacademia.cadastro.exception;

public class MatriculaNaoEncontradaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MatriculaNaoEncontradaException() {
		super("O contador não foi encontrado.");
	}
}
