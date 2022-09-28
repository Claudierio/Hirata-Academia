package basicas;

import java.util.Date;

public abstract class Pessoa {

	private String nome;
	private Date dataDeNascimento;
	private long cpf;
	private Endereco endereco;

	public Pessoa(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}

}
