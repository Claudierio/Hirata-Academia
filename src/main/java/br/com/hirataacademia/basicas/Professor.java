package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity	
public class Professor extends Funcionario{

	
	
	private long cref;
	
	public Professor(String nome, Date dataDeNascimento, String cpf, Endereco endereco, long id) {
		super(nome, dataDeNascimento, cpf, endereco, id);
		
	}

	public Professor(String nome, Date dataDeNascimento, String cpf, Endereco endereco, long cref, long id) {
		super(nome, dataDeNascimento, cpf, endereco, id);
		this.cref = cref;
	}

	public long getCref() {
		return cref;
	}

	public void setCref(long cref) {
		this.cref = cref;
	}

	
	
	
	
}
