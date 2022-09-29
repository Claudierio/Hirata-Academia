package br.com.hirataacademia.basicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Exercicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private int repeticoes;
	private int series;
	
	public Exercicio() {
		
	}
	
	public Exercicio(String nome, int repeticoes, int series) {
		super();
		this.nome = nome;
		this.repeticoes = repeticoes;
		this.series = series;
	}
	
	
	
}



	