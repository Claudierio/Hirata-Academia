package br.com.hirataacademia.cadastro.exception;

public class AlunoNaoEncontradoExcepetion extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontradoExcepetion() {
		super("O aluno não foi encontrado.");
	}
}
