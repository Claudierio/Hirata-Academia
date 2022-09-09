package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {

	private String nome;
	private Date dataDeNascimento;
	
	private long cpf;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	public Pessoa(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
}
