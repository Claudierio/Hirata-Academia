package br.com.hirataacademia.basicas;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class FichadeTreino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descricao;
	
	
	public FichadeTreino() {
		
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public void inserirTreinoA(Exercicio exercicio) {
		//treinoA.add(exercicio);
	}
	public void inserirTreinoB(Exercicio exercicio) {
		//treinoB.add(exercicio);
	}
	public void inserirTreinoC(Exercicio exercicio) {
		//treinoC.add(exercicio);
	}

/*
	public List<Exercicio> getTreinoA() {
		return treinoA;
	}


	public void setTreinoA(List<Exercicio> treinoA) {
		this.treinoA = treinoA;
	}


	public List<Exercicio> getTreinoB() {
		return treinoB;
	}


	public void setTreinoB(List<Exercicio> treinoB) {
		this.treinoB = treinoB;
	}


	public List<Exercicio> getTreinoC() {
		return treinoC;
	}


	public void setTreinoC(List<Exercicio> treinoC) {
		this.treinoC = treinoC;
	}
	
	
*/
}
