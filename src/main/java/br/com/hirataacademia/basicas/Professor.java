package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Professor extends Funcionario {

	private long cref;

	public Professor() {
		super();

	}
	
	public Professor(String nome, Date dataDeNascimento, String cpf, Endereco endereco, double salario, String turno, long cref) {
		super(nome, dataDeNascimento, cpf, endereco, salario, turno);
		this.cref = cref;
	}


	public long getCref() {
		return cref;
	}

	public void setCref(long cref) {
		this.cref = cref;
	}

}
