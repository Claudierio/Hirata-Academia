package basicas;

import java.util.Date;

public class Professor extends Funcionario {

	private String cref;

	public Professor(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);

	}

	public Professor(String nome, Date dataDeNascimento, long cpf, Endereco endereco, String cref) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.cref = cref;
	}

}
