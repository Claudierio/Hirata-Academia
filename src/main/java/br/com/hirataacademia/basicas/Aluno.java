package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno extends Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAluno;
	private float imc;
	private float peso;
	private float altura;
	private double percentualGordura;
	private String contato;
	
	public Aluno(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);
		
	}

	public Aluno(String nome, Date dataDeNascimento, long cpf, Endereco endereco, float imc, float peso, float altura,
			double percentualGordura, String contato,  long idAluno) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.imc = imc;
		this.peso = peso;
		this.altura = altura;
		this.percentualGordura = percentualGordura;
		this.contato = contato;
		this.idAluno = idAluno;
		
	}

	public long getIdAluno() {
		return idAluno;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getPercentualGordura() {
		return percentualGordura;
	}

	public void setPercentualGordura(double percentualGordura) {
		this.percentualGordura = percentualGordura;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void setIdAluno(long idAluno) {
		this.idAluno = idAluno;
	}

	
	
	
	
	
}
