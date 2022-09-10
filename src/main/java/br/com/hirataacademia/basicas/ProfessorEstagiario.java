package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class ProfessorEstagiario extends Funcionario {
	
	
	private Date inicioEstagio;
	private Date fimEstagio;
	
	public ProfessorEstagiario(String nome, Date dataDeNascimento, long cpf, Endereco endereco, long id) {
		super(nome, dataDeNascimento, cpf, endereco, id);
		
	}

	public ProfessorEstagiario(String nome, Date dataDeNascimento, long cpf, Endereco endereco, Date inicioEstagio,
			Date fimEstagio, long id) {
		super(nome, dataDeNascimento, cpf, endereco, id);
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
