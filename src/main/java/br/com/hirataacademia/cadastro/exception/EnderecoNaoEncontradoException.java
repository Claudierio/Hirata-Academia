package br.com.hirataacademia.cadastro.exception;

public class EnderecoNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EnderecoNaoEncontradoException() {
		super("O contador não foi encontrado.");
	}
}
