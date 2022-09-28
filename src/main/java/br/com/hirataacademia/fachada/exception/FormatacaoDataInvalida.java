package br.com.hirataacademia.fachada.exception;

public class FormatacaoDataInvalida extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public FormatacaoDataInvalida() {
		super("Erro ao formatar data");
	}
}
