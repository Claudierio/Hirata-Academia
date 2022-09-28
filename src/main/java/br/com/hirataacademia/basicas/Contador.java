package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Contador extends Funcionario {

	private long crc; 

	public Contador() {
		super();

	}


	
	public Contador(String nome, Date dataDeNascimento, String cpf, Endereco endereco, double salario, String turno, String contato, long crc) {
		super(nome, dataDeNascimento, cpf, endereco, salario, contato, turno);
		this.crc = crc;
	}


	public long getCrc() {
		return crc;
	}

	public void setCrc(long crc) {
		this.crc = crc;
	}

}
