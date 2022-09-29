package br.com.hirataacademia.fachada.exceptions;

public class FormatacaoDataInvalidaException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public FormatacaoDataInvalidaException() {
		super("Erro ao formatar data.");
	}
}
