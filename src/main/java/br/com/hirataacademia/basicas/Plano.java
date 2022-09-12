package br.com.hirataacademia.basicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public  class Plano {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private float preco;
	private String nome;
	
	public Plano() {
		
	}

	public Plano(float preco, String nome, long id) {
		super();
		this.preco = preco;
		this.nome = nome;
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

