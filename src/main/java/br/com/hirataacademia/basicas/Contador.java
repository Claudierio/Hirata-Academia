package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Contador extends Funcionario {

	private long crc; // crc eh o conselho de um contador.

	public Contador() {
		super();

	}


	
	public Contador(String nome, Date dataDeNascimento, String cpf, Endereco endereco, double salario, String turno, long crc) {
		super(nome, dataDeNascimento, cpf, endereco, salario, turno);
		this.crc = crc;
	}


	public long getCrc() {
		return crc;
	}

	public void setCrc(long crc) {
		this.crc = crc;
	}

}
