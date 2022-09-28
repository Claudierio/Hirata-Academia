package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

import br.com.hirataacademia.basicas.exception.ValorNegativoException;

@Entity
public class Aluno extends Pessoa {

	private float imc;
	private float peso;
	private float altura;
	private double percentualGordura;
	private String contato;

	public Aluno(String nome, Date dataDeNascimento, String cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);

	}

	public Aluno(String nome, Date dataDeNascimento, String cpf, Endereco endereco, float imc, float peso, float altura,
			double percentualGordura, String contato, long id) throws ValorNegativoException {
		super(nome, dataDeNascimento, cpf, endereco);
		this.peso = peso;
		this.altura = altura;
		if (peso <= 0 || altura <= 0) {
			throw new ValorNegativoException("O peso ou altura estão errados");
		}

		this.percentualGordura = percentualGordura;
		this.contato = contato;
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

	public void setPeso(float peso) throws ValorNegativoException {

		if (peso <= 0) {
			throw new ValorNegativoException("O peso é negativo");
		}

		this.peso = peso;

	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) throws ValorNegativoException {
		if (altura <= 0) {
			throw new ValorNegativoException("A altura é negativa");
		}

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

	

}
