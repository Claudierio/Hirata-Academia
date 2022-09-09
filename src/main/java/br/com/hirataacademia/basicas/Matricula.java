package br.com.hirataacademia.basicas;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Plano plano;
	private Aluno aluno;
	private boolean ativo;
	@OneToOne(cascade = CascadeType.ALL)
	private Modalidade modalidade;

	public Matricula(long id, Plano plano, Aluno aluno, Modalidade modalidade) {
		super();
		this.id = id;
		this.plano = plano;
		this.aluno = aluno;
		this.ativo = true;
		this.modalidade = modalidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
