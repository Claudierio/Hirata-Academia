package br.com.hirataacademia.basicas.exception;

public class EnderecoException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public EnderecoException() {
		super("Seu bairro e rua são iguais.");
	}
}
