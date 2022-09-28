package br.com.hirataacademia.basicas;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	private Plano plano;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "matricula_id")
	private Aluno aluno;
	private boolean ativo;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "matricula_modalidade", joinColumns = { @JoinColumn(name = "modalidade_id") }, inverseJoinColumns = {
			@JoinColumn(name = "matricula_id") })
	private List<Modalidade> modalidades;

	public Matricula(Plano plano, Aluno aluno, List<Modalidade> modalidades) {
		super();
		this.plano = plano;
		this.aluno = aluno;
		this.ativo = true;
		this.modalidades = modalidades;
	}

	

	

	public long getId() {
		return id;
	}


	public List<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<Modalidade> modalidades) {
		this.modalidades = modalidades;
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
