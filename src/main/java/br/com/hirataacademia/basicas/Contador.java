package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Contador extends Funcionario {

	
	private long crc; 

	public Contador(String nome, Date dataDeNascimento, String cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);

	}

	public Contador(String nome, Date dataDeNascimento, String cpf, Endereco endereco, long crc) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.crc = crc;
	}

	public long getCrc() {
		return crc;
	}

	public void setCrc(long crc) {
		this.crc = crc;
	}

}
