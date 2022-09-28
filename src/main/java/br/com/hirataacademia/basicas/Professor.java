package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;
@Entity	
public class Professor extends Funcionario{

	
	
	private long cref;
	
	public Professor(String nome, Date dataDeNascimento, String cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);
		
	}

	public Professor(String nome, Date dataDeNascimento, String cpf, Endereco endereco, long cref) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.cref = cref;
	}

	public long getCref() {
		return cref;
	}

	public void setCref(long cref) {
		this.cref = cref;
	}

	
	
	
	
}
