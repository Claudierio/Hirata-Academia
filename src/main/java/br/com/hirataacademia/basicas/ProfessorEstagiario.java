package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class ProfessorEstagiario extends Funcionario {

	private Date inicioEstagio;
	private Date fimEstagio;

	public ProfessorEstagiario() {
		super();

	}

	public ProfessorEstagiario(String nome, Date dataDeNascimento, String cpf, Endereco endereco, double salario, Date inicioEstagio, Date fimEstagio,
			String turno) {
		super(nome, dataDeNascimento, cpf, endereco, salario, turno);
		this.inicioEstagio = inicioEstagio;
		this.fimEstagio = fimEstagio;
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
