package br.com.hirataacademia.basicas;

import javax.persistence.Entity;

@Entity
public class FichadeTreino {
		
	private long id;
	private String nomeAluno;
	private int numeroExercicios;
	private int numeroSeries;
	private int duracao;
	private String intensidade;
	
	public FichadeTreino(String nomeAluno, int numeroExercicios, int numeroSeries, int duracao, String intensidade) {
		super();
		this.nomeAluno = nomeAluno;
		this.numeroExercicios = numeroExercicios;
		this.numeroSeries = numeroSeries;
		this.duracao = duracao;
		this.intensidade = intensidade;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getNumeroExercicios() {
		return numeroExercicios;
	}

	public void setNumeroExercicios(int numeroExercicios) {
		this.numeroExercicios = numeroExercicios;
	}

	public int getNumeroSeries() {
		return numeroSeries;
	}

	public void setNumeroSeries(int numeroSeries) {
		this.numeroSeries = numeroSeries;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}
	
	
	
	
}
