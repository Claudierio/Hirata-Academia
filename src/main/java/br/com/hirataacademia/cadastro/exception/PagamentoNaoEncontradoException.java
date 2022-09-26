package br.com.hirataacademia.cadastro.exception;

public class PagamentoNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PagamentoNaoEncontradoException() {
		super("O contador não foi encontrado.");
	}
}
