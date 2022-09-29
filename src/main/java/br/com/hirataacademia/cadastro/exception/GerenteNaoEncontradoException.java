package br.com.hirataacademia.cadastro.exception;

public class GerenteNaoEncontradoException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public GerenteNaoEncontradoException() {
		super("O gerente não foi encontrado");
	}
	
}
