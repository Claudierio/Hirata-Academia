package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class ProfessorEstagiario extends Funcionario {

	private Date inicioEstagio;
	private Date fimEstagio;

	public ProfessorEstagiario(String nome, Date dataDeNascimento, String cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);

	}

	public ProfessorEstagiario(String nome, Date dataDeNascimento, String cpf, Endereco endereco, Date inicioEstagio,
			Date fimEstagio) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.inicioEstagio = inicioEstagio;
		this.fimEstagio = fimEstagio;
	}

	public ProfessorEstagiario(String nome, Date dataDeNascimento, String cpf, Endereco endereco, String turno) {
		super(nome, dataDeNascimento, cpf, endereco, 600, turno);

	}

	public Date getInicioEstagio() {
		return inicioEstagio;
	}

	public void setInicioEstagio(Date inicioEstagio) {
		this.inicioEstagio = inicioEstagio;
	}

	public Date getFimEstagio() {
		return fimEstagio;
	}

	public void setFimEstagio(Date fimEstagio) {
		this.fimEstagio = fimEstagio;
	}

}
