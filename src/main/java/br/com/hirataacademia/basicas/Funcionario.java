package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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
