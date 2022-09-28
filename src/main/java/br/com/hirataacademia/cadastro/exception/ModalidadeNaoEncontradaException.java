package br.com.hirataacademia.cadastro.exception;

public class ModalidadeNaoEncontradaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ModalidadeNaoEncontradaException() {
		super("O contador não foi encontrado.");
	}
}
