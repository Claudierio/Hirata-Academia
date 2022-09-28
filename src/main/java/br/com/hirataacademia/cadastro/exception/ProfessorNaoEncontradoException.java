package br.com.hirataacademia.cadastro.exception;

public class ProfessorNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProfessorNaoEncontradoException() {
		super("O contador não foi encontrado.");
	}

}
