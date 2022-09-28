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

import br.com.hirataacademia.basicas.exception.CpfException;
import br.com.hirataacademia.basicas.exception.DataFuturaException;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private Date dataDeNascimento;
	private String cpf;
	@OneToOne(cascade = CascadeType.ALL)
	
	
	private Endereco endereco;
	public Pessoa(String nome, Date dataDeNascimento, String cpf, Endereco endereco) throws DataFuturaException,CpfException{
		super();
		this.nome = nome;
		if(dataDeNascimento.after(new Date())) {
			throw new DataFuturaException("Data impossível!");
		}
		this.dataDeNascimento = dataDeNascimento;
		if(cpf.length()>11 || cpf.length()<11) {
			throw new CpfException("o cpf é inválido");
		}
		this.cpf = cpf;
		this.endereco = endereco;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCpf() {
		
		return cpf;
	}
	public void setCpf(String cpf) throws CpfException {
		if(cpf.length()>11 || cpf.length()<11) {
			throw new CpfException("o cpf é inválido!");
		}
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
