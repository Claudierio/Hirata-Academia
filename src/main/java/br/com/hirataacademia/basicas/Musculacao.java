package br.com.hirataacademia.basicas;

import javax.persistence.Entity;

@Entity
public class Musculacao extends Modalidade {

	public Musculacao(String nome, int duracao, String intensidade, long id) {
		super(nome, duracao, intensidade, id);
	
	}

}
