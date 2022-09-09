package br.com.hirataacademia.basicas;

import javax.persistence.Entity;

@Entity
public class Ginastica extends Modalidade{

	public Ginastica(String nome, int duracao, String intensidade, long id) {
		super(nome, duracao, intensidade, id);
		
	}

}
