package br.com.hirataacademia.basicas;

import javax.persistence.Entity;

@Entity
public class Ginastica extends Modalidade {

	public Ginastica() {
		
	}
	
	
	
	public Ginastica(String nome, int duracao, String intensidade) {
		super(nome, duracao, intensidade);

	}

}
