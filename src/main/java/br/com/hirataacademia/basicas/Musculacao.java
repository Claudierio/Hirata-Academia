package br.com.hirataacademia.basicas;

import javax.persistence.Entity;

@Entity
public class Musculacao extends Modalidade {

	public Musculacao() {
		
	}
	
	public Musculacao(String nome, int duracao, String intensidade) {
		super(nome, duracao, intensidade);

	}

}
