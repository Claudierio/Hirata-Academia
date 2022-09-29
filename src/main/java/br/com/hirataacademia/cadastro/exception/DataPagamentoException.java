package br.com.hirataacademia.cadastro.exception;

public class DataPagamentoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DataPagamentoException() {
		super("Data de pagamento inválida");
	}
	
}
