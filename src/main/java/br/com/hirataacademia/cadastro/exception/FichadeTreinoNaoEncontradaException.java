package br.com.hirataacademia.cadastro.exception;

public class FichadeTreinoNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FichadeTreinoNaoEncontradaException() {
		super("A ficha de treino não foi encontrada.");
	}

}
