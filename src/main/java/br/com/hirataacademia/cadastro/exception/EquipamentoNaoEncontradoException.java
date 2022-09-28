package br.com.hirataacademia.cadastro.exception;

public class EquipamentoNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EquipamentoNaoEncontradoException() {
		super("O contador não foi encontrado.");
	}
}
