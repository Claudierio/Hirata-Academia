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
<<<<<<< HEAD

=======
	
>>>>>>> f4efe46915fefd6f1bda2b77a266b1b8e7419501
	
	public String getDescricao() {
		return descricao;
	}

	
	

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public FichadeTreino() {
		
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
<<<<<<< HEAD
=======
	
	
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
>>>>>>> f4efe46915fefd6f1bda2b77a266b1b8e7419501

}
