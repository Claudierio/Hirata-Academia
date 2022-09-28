package br.com.hirataacademia.cadastro.exception;

public class ProfessorEstagiarioNaoEncontradoExcepetion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProfessorEstagiarioNaoEncontradoExcepetion() {
		super("O estagiario não foi encontrado.");
	}

}
