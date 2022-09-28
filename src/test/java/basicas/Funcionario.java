package basicas;

import java.util.Date;

public abstract class Funcionario extends Pessoa {

	private double salario;
	private String turno;

	public Funcionario(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);

	}

	public Funcionario(String nome, Date dataDeNascimento, long cpf, Endereco endereco, double salario, String turno) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.salario = salario;
		this.turno = turno;
	}

}
