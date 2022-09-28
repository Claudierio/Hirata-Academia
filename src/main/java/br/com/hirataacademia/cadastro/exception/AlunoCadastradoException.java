package br.com.hirataacademia.cadastro.exception;

public class AlunoCadastradoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public AlunoCadastradoException() {
		super("O aluno já está cadastrado");
	}
}
