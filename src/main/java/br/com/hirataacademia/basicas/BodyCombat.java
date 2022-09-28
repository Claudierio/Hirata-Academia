package br.com.hirataacademia.basicas;

import javax.persistence.Entity;

@Entity
public class BodyCombat extends Modalidade {
	
	public BodyCombat() {
		super();
	}
	
	public BodyCombat(String nome, int duracao, String intensidade) {
		super(nome, duracao, intensidade);

	}

}
