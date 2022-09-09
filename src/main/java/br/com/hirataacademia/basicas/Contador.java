package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contador extends Funcionario {

	@Id
	private long crc; // crc eh o conselho de um contador.

	public Contador(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);

	}

	public Contador(String nome, Date dataDeNascimento, long cpf, Endereco endereco, long crc) {
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
