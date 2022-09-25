package br.com.hirataacademia.cadastro.exception;

public class DespesaNaoEncontradaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DespesaNaoEncontradaException() {
		super("O contador não foi encontrado.");
	}
}
