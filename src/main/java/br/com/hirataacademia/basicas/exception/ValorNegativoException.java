package br.com.hirataacademia.basicas.exception;

public class ValorNegativoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public ValorNegativoException(String msg) {
		super(msg);
	}
}
