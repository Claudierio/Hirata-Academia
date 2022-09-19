package br.com.hirataacademia.cadastro.exception;

public class ContadorNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ContadorNaoEncontradoException() {
		super("O contador não foi encontrado.");
	}

	
}
