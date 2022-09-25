package br.com.hirataacademia.cadastro.exception;

public class PlanoNaoEncontradoException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public PlanoNaoEncontradoException() {
		super("O contador não foi encontrado.");
	}
}
