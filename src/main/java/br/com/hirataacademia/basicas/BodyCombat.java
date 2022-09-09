package br.com.hirataacademia.basicas;

import javax.persistence.Entity;

@Entity
public class BodyCombat extends Modalidade{

	public BodyCombat(String nome, int duracao, String intensidade, long id) {
		super(nome, duracao, intensidade, id);
		
	}
	
}
