package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.hirataacademia.basicas.exception.ValorNegativoException;

@Entity
public class Aluno extends Pessoa {

	private String plano;
	private float imc;
	private float peso;
	private float altura;
	private double percentualGordura;
	private String contato;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fichadeTreino_id")
	private FichadeTreino treino;

	public Aluno() {
		super();

	}

	public Aluno(String nome, Date dataDeNascimento, String cpf, Endereco endereco, float peso, float altura,
			double percentualGordura, String contato, String plano) throws ValorNegativoException {
		super(nome, dataDeNascimento, cpf, endereco);
		
		if (peso <= 0 || altura <= 0) {
			throw new ValorNegativoException("O peso ou altura estão errados");
		}
		
		this.percentualGordura = percentualGordura;
		this.contato = contato;
		this.peso = peso;
		this.altura = altura;
		calcularImc();
		this.plano = plano;

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
		calcularImc();

	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) throws ValorNegativoException {
		if (altura <= 0) {
			throw new ValorNegativoException("A altura é negativa");
		}

		this.altura = altura;
		calcularImc();
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

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	private void calcularImc() {
		imc = peso / (altura * altura);
	}
	
	public FichadeTreino getTreino() {
		return treino;
	}

	public void setTreino(FichadeTreino treino) {
		this.treino = treino;
	}
	

	@Override
	public String toString() {
		return "Aluno [imc=" + imc + ", peso=" + peso + ", altura=" + altura + ", percentualGordura="
				+ percentualGordura + ", contato=" + contato + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getDataDeNascimento()=" + getDataDeNascimento() + ", getCpf()=" + getCpf() + ", getEndereco()="
				+ getEndereco() + "]";
	}

	public void adicionarTreinoA(Exercicio exercicio) {
		treino.inserirTreinoA(exercicio);
		
	}

	public void adicionarTreinoB(Exercicio exercicio) {
		treino.inserirTreinoB(exercicio);
		
	}

	public void adicionarTreinoC(Exercicio exercicio) {
		treino.inserirTreinoB(exercicio);
		
	}


	

}
